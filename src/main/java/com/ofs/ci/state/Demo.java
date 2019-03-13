package com.ofs.ci.state;

import com.ofs.ci.state.context.Context;
import com.ofs.ci.state.state.impl.EditState;

public class Demo {

    public static void main(String[] args) {
        Context context = new Context();
        context.changeState(new EditState());

        context.doWork(Context.PREVIEW_MODE);
        context.doWork(Context.EDIT_MODE);

        context.doWork(Context.PREVIEW_MODE);
        context.doWork(Context.EDIT_MODE);

        context.doWork(Context.PREVIEW_MODE);
        context.doWork(Context.EDIT_MODE);

        context.doWork(Context.PREVIEW_MODE);
        context.doWork(Context.EDIT_MODE);
    }
}
