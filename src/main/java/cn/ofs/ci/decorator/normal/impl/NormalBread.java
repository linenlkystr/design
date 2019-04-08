package cn.ofs.ci.decorator.normal.impl;

import cn.ofs.ci.decorator.normal.Bread;

public class NormalBread implements Bread {

    @Override
    public void prepare() {
        System.out.println("bread prepare");
    }

    @Override
    public void kneadFlour() {
        System.out.println("bread knead flour");
    }

    @Override
    public void steamed() {
        System.out.println("bread steam");
    }

    @Override
    public void process() {
        System.out.println("bread process");
        prepare();
        kneadFlour();
        steamed();
    }
}
