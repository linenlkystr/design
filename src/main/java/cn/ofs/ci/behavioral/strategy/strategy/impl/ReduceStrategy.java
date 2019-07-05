package cn.ofs.ci.behavioral.strategy.strategy.impl;

import cn.ofs.ci.behavioral.strategy.strategy.Strategy;

public class ReduceStrategy implements Strategy {

    @Override
    public double realPrice(double consumePrice) {

        if (consumePrice > 1000) {
            return consumePrice - 200;
        } else {
            return consumePrice;
        }
    }
}
