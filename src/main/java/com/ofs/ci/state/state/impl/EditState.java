package com.ofs.ci.state.state.impl;

import com.ofs.ci.state.context.Context;
import com.ofs.ci.state.state.State;

public class EditState implements State {

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
