package cn.ofs.ci.structural.flyweight.factory;

import cn.ofs.ci.structural.flyweight.object.AbstractChessman;
import cn.ofs.ci.structural.flyweight.object.BlackChessman;
import cn.ofs.ci.structural.flyweight.object.WhiteChessman;

import java.util.Hashtable;

public class FiveChessmanFactory {

    private static FiveChessmanFactory fiveChessmanFactory = new FiveChessmanFactory();

    private final Hashtable<Character, AbstractChessman> cache = new Hashtable<>();

    private FiveChessmanFactory() {
    }

    public static FiveChessmanFactory getInstance() {
        return fiveChessmanFactory;
    }

    public AbstractChessman getChessmanObject(char c) {

        AbstractChessman abstractChessman = this.cache.get(c);

        if (abstractChessman == null) {
            switch (c) {
                case 'B':
                    abstractChessman = new BlackChessman();
                    break;
                case 'W':
                    abstractChessman = new WhiteChessman();
                    break;
                default:
                    break;
            }

            if (abstractChessman != null) {
                this.cache.put(c, abstractChessman);
            }
        }
        return abstractChessman;
    }

    public void showCache() {
        for (AbstractChessman abstractChessman : cache.values()) {
            abstractChessman.show();
        }
    }
}
