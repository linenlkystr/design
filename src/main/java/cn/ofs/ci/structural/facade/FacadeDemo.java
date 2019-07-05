package cn.ofs.ci.structural.facade;

import cn.ofs.ci.structural.facade.facade.CookFacade;
import cn.ofs.ci.structural.facade.facade.impl.CookFacadeImpl;

public class FacadeDemo {

    public static void main(String[] args) {

        CookFacade cookFacade = new CookFacadeImpl();

        cookFacade.cookSpareribs();
    }
}
