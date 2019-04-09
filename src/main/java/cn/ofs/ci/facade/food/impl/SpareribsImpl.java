package cn.ofs.ci.facade.food.impl;

import cn.ofs.ci.facade.food.Spareribs;

public class SpareribsImpl implements Spareribs {

    @Override
    public void prepare() {
        System.out.println("SpareribsImpl prepare");
    }

    @Override
    public void preserve() {
        System.out.println("SpareribsImpl preserve");
    }

    @Override
    public void fry() {
        System.out.println("SpareribsImpl fry");
    }

    @Override
    public void juice() {
        System.out.println("SpareribsImpl juice");
    }
}
