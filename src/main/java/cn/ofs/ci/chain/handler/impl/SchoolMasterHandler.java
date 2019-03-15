package cn.ofs.ci.chain.handler.impl;

import cn.ofs.ci.chain.handler.AbstractHandler;
import cn.ofs.ci.chain.response.Student;

public class SchoolMasterHandler extends AbstractHandler {

    public SchoolMasterHandler() {
        super(2);
    }

    @Override
    public void process(Student student) {
        System.out.println("SchoolMasterHandler: " + student.getRequestMessage());
    }
}
