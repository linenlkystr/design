package cn.ofs.ci.behavioral.chain.handler;

import cn.ofs.ci.behavioral.chain.response.Student;

public interface Handler {

    void handlerRequest(Student student);

    void setSuperHandler(Handler handler);
}
