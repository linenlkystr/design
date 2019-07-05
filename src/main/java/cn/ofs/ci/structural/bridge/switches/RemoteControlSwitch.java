package cn.ofs.ci.structural.bridge.switches;

import cn.ofs.ci.structural.bridge.light.Light;

public class RemoteControlSwitch extends BaseSwitch {

    public RemoteControlSwitch(Light light) {
        super(light);
    }

    public void makeRemoteLight(int operator) {

        this.light.electricConnected();

        this.light.light();

        String color = null;
        switch (operator) {
            case 1:
                color = "red";
            case 2:
                color = "green";
            case 3:
                color = "yellow";
            default:
                color = "white";
                break;
        }

        System.out.println("now color is : " + color);

        this.light.electricClosed();
    }
}
