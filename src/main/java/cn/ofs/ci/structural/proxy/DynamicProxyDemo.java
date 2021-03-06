package cn.ofs.ci.structural.proxy;

import cn.ofs.ci.structural.proxy.dynamic.RedWineDynamicProxy;
import cn.ofs.ci.structural.proxy.object.RedWine;
import cn.ofs.ci.structural.proxy.object.impl.RedWineFactory;

public class DynamicProxyDemo {

    public static void main(String[] args) {

        RedWine redWine = new RedWineFactory();

        RedWineDynamicProxy dynamicProxyFactory = new RedWineDynamicProxy(redWine);
        RedWine redWineProxy = (RedWine) dynamicProxyFactory.getProxyInstance();
        redWineProxy.product(5);
        redWineProxy.sell();
    }
}
