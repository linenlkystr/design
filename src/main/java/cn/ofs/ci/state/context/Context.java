package cn.ofs.ci.state.context;

import cn.ofs.ci.state.state.State;
import cn.ofs.ci.state.state.StateFactory;
import cn.ofs.ci.state.state.impl.StateFactoryImpl;

public class Context {

    public static final int EDIT_MODE = 0;

    public static final int PREVIEW_MODE = 1;

    private State state;
    private StateFactory stateFactory = new StateFactoryImpl();

    public void changeState(State state) {
        this.state = state;
    }

    public void doWork(int mode) {
        System.out.println("--------------------------------");
        this.changeState(stateFactory.createState(mode));
        this.state.add(this);
        this.state.modify(this);
        this.state.save(this);
        this.state.view(this);
        System.out.println("--------------------------------");
    }
}
