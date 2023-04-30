package iterator;

import java.util.List;

public interface Factory {

    public List getChairs();
    public void addChair(Chair chair);
    public void removeChair(Chair chair);

    public Iterator createIterator(String iteratorType);

}
