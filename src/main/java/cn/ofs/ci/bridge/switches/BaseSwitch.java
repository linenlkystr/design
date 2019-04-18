package cn.ofs.ci.bridge.switches;

import cn.ofs.ci.bridge.light.Light;

public class BaseSwitch {

    protected Light light;

    public BaseSwitch(Light light) {
        this.light = light;
    }

    public final void makeLight() {
        this.light.electricConnected();
        this.light.light();
        this.light.electricClosed();
    }
}
