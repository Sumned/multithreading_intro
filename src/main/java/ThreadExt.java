import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Data
@Log4j2
public class ThreadExt extends Thread {
    private int start;
    private int limit;

    public ThreadExt(int start, int limit) {
        this.start = start;
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = start; i < limit; i++) {
            log.info("Thread-1 value = " + i);
        }
    }
}
