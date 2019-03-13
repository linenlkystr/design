package com.ofs.ci.state.context;

import com.ofs.ci.state.state.State;

public class Context {

    public static final int EDIT_MODE = 0;

    public static final int PREVIEW_MODE = 1;

    private State state;

    public void changeState(State state) {
        this.state = state;
    }

    public void doWork(int mode) {
        System.out.println("--------------------------------");
        this.state.saveContext(this, mode);
        this.state.add(this);
        this.state.modify(this);
        this.state.save(this);
        this.state.view(this);
        System.out.println("--------------------------------");
    }
}
