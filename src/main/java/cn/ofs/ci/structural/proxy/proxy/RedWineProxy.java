package cn.ofs.ci.structural.proxy.proxy;

import cn.ofs.ci.structural.proxy.object.RedWine;

public class RedWineProxy implements RedWine {

    private RedWine redWine;

    public RedWineProxy(RedWine redWine) {
        this.redWine = redWine;
    }

    @Override
    public void product(int num) {
        this.redWine.product(num);
    }

    @Override
    public void sell() {
        this.redWine.sell();
    }
}
