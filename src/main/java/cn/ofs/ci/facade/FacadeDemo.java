package cn.ofs.ci.facade;

import cn.ofs.ci.facade.facade.CookFacade;
import cn.ofs.ci.facade.facade.impl.CookFacadeImpl;

public class FacadeDemo {

    public static void main(String[] args) {

        CookFacade cookFacade = new CookFacadeImpl();

        cookFacade.cookSpareribs();
    }
}
