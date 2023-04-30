package iterator;

import java.util.List;

public class EmpireChairIterator implements Iterator {

    public List<Chair> chairList;
    private int position;

    public EmpireChairIterator(List chairList) {
        this.chairList = chairList;
    }
    @Override
    public Chair nextChair() {
        Chair chair = null;
        for (; position < chairList.size(); position++) {
            if ("Empire".equals((chairList.get(position)).getChairType())) {
                chair = chairList.get(position);
                position++;
                break;
            }
        }
        return chair;
    }

    @Override
    public boolean isLastChair() {
        for (int i = position; i < chairList.size(); i++) {
            if ("Empire".equals((chairList.get(i)).getChairType())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Chair currentChair() {
        if (position < chairList.size()) {
            return chairList.get(position);
        }
        return null;
    }
}
