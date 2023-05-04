import java.util.ArrayList;

public class Puerto {
    private ArrayList<Barco> barcosEntrantes;
    private ArrayList<Pantalan> listaPantalan;

    // Constructores
    public Puerto() {
    }

    public Puerto(ArrayList<Barco> barcosEntrantes, ArrayList<Pantalan> listaPantalan) {
        this.barcosEntrantes = barcosEntrantes;
        this.listaPantalan = listaPantalan;
    }

    // Getters y setters
    public ArrayList<Barco> getBarcosEntrantes() {
        return barcosEntrantes;
    }

    public void setBarcosEntrantes(ArrayList<Barco> barcosEntrantes) {
        this.barcosEntrantes = barcosEntrantes;
    }

    public ArrayList<Pantalan> getListaPantalan() {
        return listaPantalan;
    }

    public void setListaPantalan(ArrayList<Pantalan> listaPantalan) {
        this.listaPantalan = listaPantalan;
    }

    public static void buscarAmarre(ArrayList<Barco> barcosEntrantes, ArrayList<Pantalan> listaPantalan) {
        for (Barco barcoActual : barcosEntrantes) {
            if (barcoActual.getMatricula() == Barco.mayorTamaño(barcosEntrantes)) {
                for (int i = 0; i < listaPantalan.size(); i++) {
                    for (int j = 0; j < listaPantalan.get(i).getListaAmarre().size(); j++) {
                        Amarre amarreActual = listaPantalan.get(i).getListaAmarre().get(j);

                        if (barcoActual instanceof Comercial) {
                            Comercial barcoComercial = (Comercial) barcoActual;
                            if (barcoComercial.encajaTamaño(amarreActual) < 0
                                    && barcoComercial.encajaTipo(listaPantalan.get(i)) == true) {
                                amarreActual.setBarco(barcoComercial);
                                amarreActual.setOcupado(true);
                                barcosEntrantes.remove(barcoComercial);
                            }
                        } else if (barcoActual instanceof Recreo) {
                            Recreo barcoRecreo = (Recreo) barcoActual;
                            if (barcoRecreo.encajaTamaño(amarreActual) < 0
                                    && barcoRecreo.encajaTipo(listaPantalan.get(i)) == true) {
                                amarreActual.setBarco(barcoRecreo);
                                amarreActual.setOcupado(true);
                                barcosEntrantes.remove(barcoRecreo);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void simular(ArrayList<Pantalan> listaPantalan, ArrayList<Barco> barcosEntrantes){
        ArrayList<Amarre> listaAmarre = new ArrayList<>();

        Amarre a1 = new Amarre(120, false, null);
        Amarre a2 = new Amarre(90, false, null);
        Amarre a3 = new Amarre(20, false, null);

        listaAmarre.add(a1);
        listaAmarre.add(a2);
        listaAmarre.add(a3);

        Pantalan p1 = new Pantalan(listaAmarre, "Comercial");
        Pantalan p2 = new Pantalan(listaAmarre, "Recreo");
        Pantalan p3 = new Pantalan(listaAmarre, "Comercial");
        Pantalan p4 = new Pantalan(listaAmarre, "Recreo");

        listaPantalan.add(p1);
        listaPantalan.add(p2);
        listaPantalan.add(p3);
        listaPantalan.add(p4);
    }

    public static void verAmarre(ArrayList<Pantalan> listaPantalan) {
        System.out.println("Barcos:");
        System.out.println();
        for (Pantalan pantalanActual : listaPantalan) {
            int i = 0;
            if (pantalanActual.getListaAmarre().get(i).isOcupado() == true) {
                System.out.println(
                        pantalanActual.getListaAmarre().get(i).getBarco().getMatricula() + " - Barco amarrado");
            }
            System.out.println();
            System.out.println("Pantalán:");
            System.out.println();
            System.out.println(pantalanActual.toString());
            System.out.println("[");
            System.out.println(pantalanActual.getListaAmarre().get(i).toString());
            System.out.println("]");
            i++;
            
        }

    }
    
    

    
}
