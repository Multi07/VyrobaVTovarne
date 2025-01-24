public class Tovarna {
    private static int pocetProduktu;
    public synchronized static void pridejProdukt() {
        pocetProduktu++;
    }

    public synchronized static int getPocetProduktu() {
        return pocetProduktu;
    }

}
