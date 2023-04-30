package iterator;

public class Chair {

    public Chair(boolean haveBack, boolean havehadrail, int height, int width, String chairType) {
        this.haveBack = haveBack;
        this.havehadrail = havehadrail;
        this.height = height;
        this.width = width;
        this.chairType = chairType;
    }

    private boolean haveBack;
    private boolean havehadrail;
    private int height;
    private int width;
    private String chairType;


    public boolean isHaveBack() {
        return haveBack;
    }

    public void setHaveBack(boolean haveBack) {
        this.haveBack = haveBack;
    }

    public boolean isHavehadrail() {
        return havehadrail;
    }

    public void setHavehadrail(boolean havehadrail) {
        this.havehadrail = havehadrail;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getChairType() {
        return chairType;
    }

    public void setChairType(String chairType) {
        this.chairType = chairType;
    }

    @Override
    public String toString() {
        return "Стілець: " +
                "має спинку=" + (haveBack ? "так" : "ні") +
                ", має поручень=" + (havehadrail ? "так" : "ні") +
                ", висота=" + height +
                ", ширина=" + width +
                ", тип стільця='" + chairType + '\'';
    }
}
