package cn.ofs.ci.structural.flyweight.object;

public class BlackChessman extends AbstractChessman {

    public BlackChessman() {
        super("black");
        System.out.println("black chessman construction exec");
    }

    @Override
    public void point(int x, int y) {
        this.x = x;
        this.y = y;
        this.show();
    }
}
