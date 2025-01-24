import java.util.Random;

public class VyrobniLinka extends Thread{
    Random rand = new Random();
    int pocet = rand.nextInt(5);
    private final String name1;
    public VyrobniLinka(String name1) {
        this.name1 = name1;
    }

    public int getPocet() {
        return pocet;
    }

    public String getName1() {
        return name1;
    }

    @Override
    public void run() {
        for (int i = 1; i <= pocet+5; i++) {
            try {
                int randSleep = rand.nextInt(10);
                Thread.sleep(randSleep*100);
                Tovarna.pridejProdukt();
                System.out.println(name1+" Vyrobila "+i+". produkt. Celkový počet produktů: "+ Tovarna.getPocetProduktu());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
