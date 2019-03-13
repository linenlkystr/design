package com.ofs.ci.state.state.impl;

import com.ofs.ci.state.context.Context;
import com.ofs.ci.state.state.State;
import com.ofs.ci.state.state.StateFactory;

public class StateFactoryImpl implements StateFactory {

    @Override
    public State createState(int mode) {
        switch (mode) {
            case Context.EDIT_MODE:
                return new EditState();
            case Context.PREVIEW_MODE:
                return new PreviewState();
            default:
                return new EditState();
        }
    }
}
