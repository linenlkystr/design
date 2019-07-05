package cn.ofs.ci.structural.proxy;

import cn.ofs.ci.structural.proxy.object.RedWine;
import cn.ofs.ci.structural.proxy.object.impl.RedWineFactory;
import cn.ofs.ci.structural.proxy.proxy.RedWineProxy;

public class ProxyDemo {

    public static void main(String[] args) {

        RedWine redWine = new RedWineFactory();
        RedWineProxy redWineProxy = new RedWineProxy(redWine);

        redWineProxy.product(5);
        redWineProxy.sell();
    }
}
