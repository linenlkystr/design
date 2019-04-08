package cn.ofs.ci.decorator.decorator;

import cn.ofs.ci.decorator.normal.Bread;

public class AbstractBread implements Bread {

    private Bread bread;

    public AbstractBread(Bread bread) {
        this.bread = bread;
    }

    @Override
    public void prepare() {
        bread.prepare();
    }

    @Override
    public void kneadFlour() {
        this.bread.kneadFlour();
    }

    @Override
    public void steamed() {
        this.bread.steamed();
    }

    @Override
    public void process() {
        prepare();
        kneadFlour();
        steamed();
    }
}
