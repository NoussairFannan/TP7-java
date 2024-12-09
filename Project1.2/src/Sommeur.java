import java.util.List;

public class Sommeur implements Runnable {
    public List<Integer> listEnt;
    public int debut;
    public int fin;
    public static int somme;

    public Sommeur(List<Integer> listEnt, int debut, int fin) {
        this.listEnt = listEnt;
        this.debut = debut;
        this.fin = fin;
    }

    public static int getSomme(){
        return somme;
    }
    @Override
    public void run() {
        List<Integer> listDebFin = listEnt.subList(debut, fin);
        synchronized (Sommeur.class) {
            somme += listDebFin.stream().reduce((a, b) -> a + b).get();
        }
    }
}
