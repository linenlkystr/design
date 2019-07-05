package cn.ofs.ci.behavioral.state.context;

import cn.ofs.ci.behavioral.state.state.State;
import cn.ofs.ci.behavioral.state.state.StateMode;

public class Context {

    public static final int EDIT_MODE = 0;

    public static final int PREVIEW_MODE = 1;

    private State state;

    public void changeState(State state) {
        this.state = state;
    }

    public void doWork(StateMode stateMode) {
        System.out.println("--------------------------------");
        this.state.saveContext(this, stateMode);
        this.state.add(this);
        this.state.modify(this);
        this.state.save(this);
        this.state.view(this);
        System.out.println("--------------------------------");
    }
}
