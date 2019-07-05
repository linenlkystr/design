package cn.ofs.ci.structural.flyweight.object;

public class WhiteChessman extends AbstractChessman {

    public WhiteChessman() {
        super("white");
        System.out.println("white chessman construction exec");
    }

    @Override
    public void point(int x, int y) {
        this.x = x;
        this.y = y;
        this.show();
    }
}
