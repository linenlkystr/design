package com.ofs.ci.state.state;

import com.ofs.ci.state.context.Context;

public interface State {

    void saveContext(Context context, int mode);

    void save(Context context);

    void modify(Context context);

    void add(Context context);

    void view(Context context);
}
