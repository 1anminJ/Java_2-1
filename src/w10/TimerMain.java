public class TimerMain {
    public static void main(String[] args) {
        // TimerThread th1 = new TimerThread();
        Thread th2 = new Thread(new TimerRuunable());
        th2.start();
    }
}
