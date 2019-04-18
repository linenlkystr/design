package cn.ofs.ci.bridge.light.impl;

import cn.ofs.ci.bridge.light.Light;

public class IncandescentLight implements Light {

    @Override
    public void electricConnected() {
        System.out.println("Incandescent Light Electric Connected");
    }

    @Override
    public void light() {
        System.out.println("Incandescent Light Lighted");
    }

    @Override
    public void electricClosed() {
        System.out.println("Incandescent Light Electric Closed");
    }
}
