package iterator;

import java.util.ArrayList;
import java.util.List;

public class FactoryImpl implements Factory{

    List<Chair> chairList = new ArrayList<>();

    @Override
    public List getChairs() {
        return chairList;
    }

    @Override
    public void addChair(Chair chair) {
        chairList.add(chair);
    }

    @Override
    public void removeChair(Chair chair) {
        chairList.remove(chair);
    }

    @Override
    public Iterator createIterator(String iteratorType) {
        if ("Modern".equals(iteratorType)) {
            return new ModernChairIterator(chairList);
        } else {
            return new EmpireChairIterator(chairList);
        }
    }
}
