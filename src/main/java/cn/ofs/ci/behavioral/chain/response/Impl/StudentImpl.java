package cn.ofs.ci.behavioral.chain.response.Impl;

import cn.ofs.ci.behavioral.chain.response.Student;

public class StudentImpl implements Student {

    private int state;
    private final String message;

    public StudentImpl(int state, String message) {
        this.state = state;
        this.message = message;
    }

    @Override
    public int getState() {
        return this.state;
    }

    @Override
    public String getRequestMessage() {
        return this.message;
    }
}
