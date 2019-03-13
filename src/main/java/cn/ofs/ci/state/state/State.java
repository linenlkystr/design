package cn.ofs.ci.state.state;

import cn.ofs.ci.state.context.Context;

public interface State {

    void save(Context context);

    void modify(Context context);

    void add(Context context);

    void view(Context context);
}
