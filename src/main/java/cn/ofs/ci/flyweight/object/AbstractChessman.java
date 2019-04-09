package cn.ofs.ci.flyweight.object;

public abstract class AbstractChessman {

    protected int x;
    protected int y;
    protected String chess;

    public AbstractChessman(String chess) {
        this.chess = chess;
    }

    public abstract void point(int x, int y);

    public void show() {
        System.out.println(this.chess + "(" + this.x + "," + this.y + ")");
    }
}
