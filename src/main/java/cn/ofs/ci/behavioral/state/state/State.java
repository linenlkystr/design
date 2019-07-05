package cn.ofs.ci.behavioral.state.state;

import cn.ofs.ci.behavioral.state.context.Context;

public interface State {

    void saveContext(Context context, StateMode mode);

    void save(Context context);

    void modify(Context context);

    void add(Context context);

    void view(Context context);
}
