package cn.ofs.ci.structural.flyweight;

import cn.ofs.ci.structural.flyweight.factory.FiveChessmanFactory;
import cn.ofs.ci.structural.flyweight.object.AbstractChessman;

import java.util.Random;

public class FlyweightDemo {

    public static void main(String[] args) {

        FiveChessmanFactory fiveChessmanFactory = FiveChessmanFactory.getInstance();

        Random random = new Random();

        AbstractChessman abstractChessman = null;

        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(2)) {
                case 0:
                    abstractChessman = fiveChessmanFactory.getChessmanObject('B');
                    break;
                case 1:
                    abstractChessman = fiveChessmanFactory.getChessmanObject('W');
                    break;
            }

            if (abstractChessman != null) {
                abstractChessman.point(i, random.nextInt(20));
            }
        }

        System.out.println("-------------------------");
        fiveChessmanFactory.showCache();
    }
}
