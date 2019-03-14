package cn.ofs.ci.strategy;

import cn.ofs.ci.strategy.context.Context;
import cn.ofs.ci.strategy.strategy.impl.PromotionalStrategy;
import cn.ofs.ci.strategy.strategy.impl.RebateStrategy;
import cn.ofs.ci.strategy.strategy.impl.ReduceStrategy;

public class StrategyDemo {


    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new RebateStrategy());
        double val = context.cul(1001);
        System.out.println(val);

        context.setStrategy(new ReduceStrategy());
        double val1 = context.cul(1001);
        System.out.println(val1);

        context.setStrategy(new PromotionalStrategy());
        double val2 = context.cul(1001);
        System.out.println(val2);
    }
}
