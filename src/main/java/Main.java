public class Main {
    static RunImpl run = new RunImpl();
    static ThreadExt ext = new ThreadExt();

    public static void main(String[] args) {
        Thread thread = new Thread(run);
        thread.start();
        ext.start();
    }
}
