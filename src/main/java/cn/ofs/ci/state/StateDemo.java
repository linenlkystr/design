package cn.ofs.ci.state;

import cn.ofs.ci.state.context.Context;
import cn.ofs.ci.state.state.StateMode;
import cn.ofs.ci.state.state.impl.EditState;

public class StateDemo {

    public static void main(String[] args) {
        Context context = new Context();
        context.changeState(new EditState());

        context.doWork(StateMode.PREVIEW_MODE);
        context.doWork(StateMode.EDIT_MODE);

        context.doWork(StateMode.PREVIEW_MODE);
        context.doWork(StateMode.EDIT_MODE);

        context.doWork(StateMode.PREVIEW_MODE);
        context.doWork(StateMode.EDIT_MODE);

        context.doWork(StateMode.PREVIEW_MODE);
        context.doWork(StateMode.EDIT_MODE);
    }
}
