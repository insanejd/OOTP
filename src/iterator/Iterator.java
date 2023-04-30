package iterator;

public interface Iterator {
    public Chair nextChair();

    public boolean isLastChair();

    public Chair currentChair();
}
