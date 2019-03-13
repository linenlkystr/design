package cn.ofs.ci.state.state.impl;

import cn.ofs.ci.state.context.Context;
import cn.ofs.ci.state.state.State;
import cn.ofs.ci.state.state.StateMode;

public class EditState implements State {

    @Override
    public void saveContext(Context context, StateMode mode) {
        if (mode == StateMode.PREVIEW_MODE) {
            context.changeState(new PreviewState());
        }
    }

    @Override
    public void save(Context context) {
        System.out.println("编辑模式【保存】");
    }

    @Override
    public void modify(Context context) {
        System.out.println("编辑模式【修改】");
    }

    @Override
    public void add(Context context) {
        System.out.println("编辑模式【修改】");
    }

    @Override
    public void view(Context context) {
        System.out.println("编辑模式不支持【预览】");
    }
}
