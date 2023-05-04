import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Barco> barcosEntrantes = new ArrayList<>();
        ArrayList<Pantalan> lisaPantalan = new ArrayList<>();

        Barco.cargarBarcosEntrantes(barcosEntrantes);
        Puerto.simular(lisaPantalan, barcosEntrantes);
        Puerto.buscarAmarre(barcosEntrantes, lisaPantalan);
        Puerto.verAmarre(lisaPantalan);
    }
}
