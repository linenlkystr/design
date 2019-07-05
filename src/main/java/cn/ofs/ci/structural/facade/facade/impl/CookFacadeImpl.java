package cn.ofs.ci.structural.facade.facade.impl;

import cn.ofs.ci.structural.facade.facade.CookFacade;
import cn.ofs.ci.structural.facade.food.Spareribs;
import cn.ofs.ci.structural.facade.food.impl.SpareribsImpl;

public class CookFacadeImpl implements CookFacade {

    private final Spareribs spareribs = new SpareribsImpl();

    @Override
    public void cookSpareribs() {
        spareribs.prepare();
        spareribs.preserve();
        spareribs.fry();
        spareribs.juice();
    }
}
