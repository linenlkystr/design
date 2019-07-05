package cn.ofs.ci.structural.decorator.decorator;

import cn.ofs.ci.structural.decorator.normal.Bread;

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
