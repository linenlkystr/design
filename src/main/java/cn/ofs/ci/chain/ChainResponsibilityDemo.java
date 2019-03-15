package cn.ofs.ci.chain;

import cn.ofs.ci.chain.process.ProcessHandler;
import cn.ofs.ci.chain.response.Impl.StudentImpl;
import cn.ofs.ci.chain.response.Student;

public class ChainResponsibilityDemo {

    public static void main(String[] args) {

        Student student = new StudentImpl(0, "0");
        Student student1 = new StudentImpl(1, "1");
        Student student2 = new StudentImpl(2, "2");
        Student student3 = new StudentImpl(1, "1");

        ProcessHandler.getInstance().sendMessage(student);
        ProcessHandler.getInstance().sendMessage(student1);
        ProcessHandler.getInstance().sendMessage(student2);
        ProcessHandler.getInstance().sendMessage(student3);
    }
}
