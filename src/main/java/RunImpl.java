import lombok.extern.log4j.Log4j2;

@Log4j2
public class RunImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            log.info("Thread-0 value = " + i);
        }
    }
}
