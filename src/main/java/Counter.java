import lombok.Data;

@Data
public class Counter {
    private int count;
    private int limit;

    public Counter(int count, int limit) {
        this.count = count;
        this.limit = limit;
    }

    public synchronized int plus() {
        return count++;
    }

    public synchronized boolean limitCheck() {
        return count <= limit;
    }
}
