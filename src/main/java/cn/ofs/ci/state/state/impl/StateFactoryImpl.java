package cn.ofs.ci.state.state.impl;

import cn.ofs.ci.state.context.Context;
import cn.ofs.ci.state.state.State;
import cn.ofs.ci.state.state.StateFactory;

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
