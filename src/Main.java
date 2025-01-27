import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<VyrobniLinka> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(new VyrobniLinka("Linka "+i));

        }
        for (Thread thread : list) {
            thread.start();
        }
        for (Thread thread : list) {
            thread.join();
        }
        System.out.println("Výroba dokončena! Celkový počet vyrobených produktů: "+ Tovarna.getPocetProduktu());

        VyrobniLinka best = list.get(0);
        for (VyrobniLinka linka : list) {
            if (best.getPocet()<linka.getPocet()) {
                best = linka;
            }
        }
        System.out.println("Nejvíce Produktů vytvořila: "+best.getName1()+" a vyrobila: "+(best.getPocet()+5)+" Produkty");
    }

}
