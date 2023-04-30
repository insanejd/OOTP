package protorype;

public class Chair implements Product{

    public Chair(boolean haveBack, boolean havehadrail, int height, int width) {
        this.haveBack = haveBack;
        this.havehadrail = havehadrail;
        this.height = height;
        this.width = width;
    }

    boolean haveBack;
    boolean havehadrail;
    int height;
    int width;

    @Override
    public Product clone() {
        return new Chair(this.haveBack, this.havehadrail, this.height, this.width);
    }

    @Override
    public String getInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Chair{" +
                "haveBack=" + haveBack +
                ", havehadrail=" + havehadrail +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

}
