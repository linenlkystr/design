package cn.ofs.ci.structural.bridge;

import cn.ofs.ci.structural.bridge.light.Light;
import cn.ofs.ci.structural.bridge.light.impl.CrystalLight;
import cn.ofs.ci.structural.bridge.light.impl.IncandescentLight;
import cn.ofs.ci.structural.bridge.switches.BaseSwitch;
import cn.ofs.ci.structural.bridge.switches.RemoteControlSwitch;

public class BridgeDemo {

    public static void main(String[] args) {
        Light crystalLight = new CrystalLight();
        Light incandescentLight = new IncandescentLight();

        BaseSwitch baseSwitch = new BaseSwitch(crystalLight);
        baseSwitch.makeLight();

        RemoteControlSwitch remoteControlSwitch = new RemoteControlSwitch(incandescentLight);
        remoteControlSwitch.makeRemoteLight(1);
        remoteControlSwitch.makeLight();
    }
}
