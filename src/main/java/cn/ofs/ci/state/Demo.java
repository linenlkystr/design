package cn.ofs.ci.state;

import cn.ofs.ci.state.context.Context;
import cn.ofs.ci.state.state.impl.EditState;

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
