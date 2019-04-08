package cn.ofs.ci.proxy.dynamic;

import java.lang.reflect.Proxy;

public class RedWineDynamicProxy {

    private Object target;

    public RedWineDynamicProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("--method: " + method.getName());
                    Object invoke = method.invoke(target, args);
                    System.out.println("--动态代理实现: " + proxy.getClass().getName());
                    System.out.println("--代理对象：" + target.getClass().getName());
                    return invoke;
                });
    }
}
