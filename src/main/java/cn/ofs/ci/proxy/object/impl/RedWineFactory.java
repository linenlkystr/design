package cn.ofs.ci.proxy.object.impl;

import cn.ofs.ci.proxy.object.RedWine;

public class RedWineFactory implements RedWine {

    @Override
    public void product(int num) {
        System.out.println("RedWineFactory product red wine: " + num);
    }

    @Override
    public void sell() {
        System.out.println("RedWineFactory sell red wine");
    }
}
