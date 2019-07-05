package cn.ofs.ci.behavioral.strategy.strategy.impl;

import cn.ofs.ci.behavioral.strategy.strategy.Strategy;

public class RebateStrategy implements Strategy {

    private final double rate;

    public RebateStrategy() {
        this.rate = 0.8;
    }

    @Override
    public double realPrice(double consumePrice) {
        return consumePrice * this.rate;
    }
}
