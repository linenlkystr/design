package cn.ofs.ci.chain.handler;

import cn.ofs.ci.chain.response.Student;

public interface Handler {

    void handlerRequest(Student student);

    void setSuperHandler(Handler handler);
}
