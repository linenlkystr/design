package cn.ofs.ci.structural.decorator;

import cn.ofs.ci.structural.decorator.decorator.CornBread;
import cn.ofs.ci.structural.decorator.decorator.SweetBread;
import cn.ofs.ci.structural.decorator.normal.Bread;
import cn.ofs.ci.structural.decorator.normal.impl.NormalBread;

public class DecoratorDemo {

    public static void main(String[] args) {
        Bread bread = new NormalBread();

        bread = new CornBread(bread);
        bread = new SweetBread(bread);

        bread.process();
    }
}
