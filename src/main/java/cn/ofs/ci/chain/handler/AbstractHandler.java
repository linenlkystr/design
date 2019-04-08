package cn.ofs.ci.chain.handler;

import cn.ofs.ci.chain.response.Student;

public abstract class AbstractHandler implements Handler {

    private int state;
    private Handler handler;

    public AbstractHandler(int state) {
        this.state = state;
    }

    public abstract void process(Student student);

    @Override
    public void handlerRequest(Student student) {

        if (student != null) {

            if (student.getState() == this.state) {
                this.process(student);
            } else {
                if (this.handler != null) {
                    this.handler.handlerRequest(student);
                }
            }
        }
    }

    @Override
    public void setSuperHandler(Handler handler) {
        this.handler = handler;
    }
}
