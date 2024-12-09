public class Talkative implements Runnable{

    public int number;

    public Talkative(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(number);
        }
    }
}
