public class Main {
    private static final int START = 0;
    private static final int LIMIT = 100;
    private static RunImpl run;
    private static ThreadExt ext;

    public static void main(String[] args) {
        run = new RunImpl(START, LIMIT);
        ext = new ThreadExt(START, LIMIT);
        Thread thread = new Thread(run);
        thread.start();
        ext.start();
    }
}
