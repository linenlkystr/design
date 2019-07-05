package cn.ofs.ci.behavioral.state.state.impl;

import cn.ofs.ci.behavioral.state.context.Context;
import cn.ofs.ci.behavioral.state.state.State;
import cn.ofs.ci.behavioral.state.state.StateMode;

public class PreviewState implements State {

    @Override
    public void saveContext(Context context, StateMode mode) {
        if (mode == StateMode.EDIT_MODE) {
            context.changeState(new EditState());
        }
    }

    @Override
    public void save(Context context) {
        System.out.println("预览模式不支持【保存】");
    }

    @Override
    public void modify(Context context) {
        System.out.println("预览模式不支持【修改】");

    }

    @Override
    public void add(Context context) {
        System.out.println("预览模式不支持【增加】");

    }

    @Override
    public void view(Context context) {
        System.out.println("预览模式【预览】");

    }
}
