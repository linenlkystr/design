package cn.ofs.ci.structural.bridge.light.impl;

import cn.ofs.ci.structural.bridge.light.Light;

public class CrystalLight implements Light {

    @Override
    public void electricConnected() {
        System.out.println("Crystal Light Electric Connected");
    }

    @Override
    public void light() {
        System.out.println("Crystal Light lighted");
    }

    @Override
    public void electricClosed() {
        System.out.println("Crystal Light Electric Closed");
    }
}
