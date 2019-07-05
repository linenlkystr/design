package cn.ofs.ci.behavioral.chain.process;

import cn.ofs.ci.behavioral.chain.handler.Handler;
import cn.ofs.ci.behavioral.chain.handler.impl.SchoolMasterHandler;
import cn.ofs.ci.behavioral.chain.handler.impl.SquadLeaderHandler;
import cn.ofs.ci.behavioral.chain.handler.impl.TeacherHandler;
import cn.ofs.ci.behavioral.chain.response.Student;

public class ProcessHandler {

    private final Handler squadLeaderHandler;
    private final Handler teacherHandler;
    private final Handler schoolMasterHandler;

    private static ProcessHandler processHandler = new ProcessHandler();

    private ProcessHandler() {

        this.squadLeaderHandler = new SquadLeaderHandler();
        this.teacherHandler = new TeacherHandler();
        this.schoolMasterHandler = new SchoolMasterHandler();

        this.squadLeaderHandler.setSuperHandler(this.teacherHandler);
        this.teacherHandler.setSuperHandler(this.schoolMasterHandler);
    }

    public static ProcessHandler getInstance() {
        return processHandler;
    }

    public void sendMessage(Student student) {
        this.squadLeaderHandler.handlerRequest(student);
    }
}
