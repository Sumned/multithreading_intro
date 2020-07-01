import lombok.Data;

@Data
public class Counter {
    int count;
    int limit;

    public Counter(int count, int limit) {
        this.count = count;
        this.limit = limit;
    }

    synchronized int plus() {
        return count++;
    }

    public boolean limitCheck() {
        return count <= limit;
    }
}
