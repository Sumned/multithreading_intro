public class Main {
    private static final int START = 0;
    private static final int LIMIT = 100;

    public static void main(String[] args) {
        RunImpl run = new RunImpl(START, LIMIT);
        ThreadExt ext = new ThreadExt(START, LIMIT);
        Thread thread = new Thread(run);
        thread.start();
        ext.start();
    }
}
