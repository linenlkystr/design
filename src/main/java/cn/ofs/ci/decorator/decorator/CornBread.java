package cn.ofs.ci.decorator.decorator;

import cn.ofs.ci.decorator.normal.Bread;

public class CornBread extends AbstractBread {

    public CornBread(Bread bread) {
        super(bread);
    }

    @Override
    public void kneadFlour() {
        this.paint();
        super.kneadFlour();
    }

    private void paint() {
        System.out.println("CornBread paint");
    }
}
