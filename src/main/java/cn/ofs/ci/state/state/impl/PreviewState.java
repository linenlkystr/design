package cn.ofs.ci.state.state.impl;

import cn.ofs.ci.state.context.Context;
import cn.ofs.ci.state.state.State;

public class PreviewState implements State {

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
