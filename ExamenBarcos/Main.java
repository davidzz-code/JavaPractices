package ExamenBarcos;

public class Main {
    public static void main(String[] args) {
        Crucero c1 = new Crucero();
        System.out.println(c1.toString());

        System.out.println();

        Portaaviones po1 = new Portaaviones();
        po1.setNumAviones(10);
        po1.setNumMarinos(3);
        System.out.println(po1.toString());

        System.out.println();

        Pesquero pe1 = new Pesquero();
        System.out.println(pe1.toString());

        System.out.println();

        System.out.println(c1.alarma());
        System.out.println(c1.mensajeSocorro());
        System.out.println(po1.alarma());
        System.out.println(po1.mensajeSocorro());
        System.out.println(pe1.alarma());
        System.out.println(pe1.mensajeSocorro());
        
    }
    
}
