import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Sommeur s1 = new Sommeur(listInt,0,4);
        Sommeur s2 = new Sommeur(listInt,4,7);
        Sommeur s3 = new Sommeur(listInt,7,10);

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println("La Somme egale a : "+ Sommeur.getSomme());
    }
}