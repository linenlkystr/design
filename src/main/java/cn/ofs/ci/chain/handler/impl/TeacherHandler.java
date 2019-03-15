package cn.ofs.ci.chain.handler.impl;

import cn.ofs.ci.chain.handler.AbstractHandler;
import cn.ofs.ci.chain.response.Student;

public class TeacherHandler extends AbstractHandler {

    public TeacherHandler() {
        super(1);
    }

    @Override
    public void process(Student student) {
        System.out.println("TeacherHandler: " + student.getRequestMessage());
    }
}
