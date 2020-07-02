public class Main {
    private static final int START = 0;
    private static final int LIMIT = 100;
    private static int number = 0;

    public static void main(String[] args) {
        Counter counter = new Counter(START, LIMIT);
        RunImpl run = new RunImpl(counter, number++);
        ThreadExt ext = new ThreadExt(counter, number++);
        ThreadExt ext1 = new ThreadExt(counter, number++);
        Thread thread = new Thread(run);
        thread.start();
        ext.start();
        ext1.start();
    }
}
