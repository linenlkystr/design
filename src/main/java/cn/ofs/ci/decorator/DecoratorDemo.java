package cn.ofs.ci.decorator;

import cn.ofs.ci.decorator.decorator.CornBread;
import cn.ofs.ci.decorator.decorator.SweetBread;
import cn.ofs.ci.decorator.normal.Bread;
import cn.ofs.ci.decorator.normal.impl.NormalBread;

public class DecoratorDemo {

    public static void main(String[] args) {
        Bread bread = new NormalBread();

        bread = new CornBread(bread);
        bread = new SweetBread(bread);

        bread.process();
    }
}
