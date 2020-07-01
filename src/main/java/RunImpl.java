import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Data
@Log4j2
public class RunImpl implements Runnable {
    private Counter counter;
    private int num;

    public RunImpl(Counter counter, int num) {
        this.counter = counter;
        this.num = num;
    }

    @Override
    public void run() {
        while (counter.limitCheck()) {
            log.info("Thread-" + num + " value = " + counter.plus());
        }
    }
}
