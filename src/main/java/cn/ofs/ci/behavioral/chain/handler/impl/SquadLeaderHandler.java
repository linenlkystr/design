package cn.ofs.ci.behavioral.chain.handler.impl;

import cn.ofs.ci.behavioral.chain.handler.AbstractHandler;
import cn.ofs.ci.behavioral.chain.response.Student;

public class SquadLeaderHandler extends AbstractHandler {

    public SquadLeaderHandler() {
        super(0);
    }

    @Override
    public void process(Student student) {
        System.out.println("SquadLeaderHandler: " + student.getRequestMessage());
    }
}
