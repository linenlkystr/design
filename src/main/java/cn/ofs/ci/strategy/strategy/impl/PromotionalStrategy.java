package cn.ofs.ci.strategy.strategy.impl;

import cn.ofs.ci.strategy.strategy.Strategy;

public class PromotionalStrategy implements Strategy {

    @Override
    public double realPrice(double consumePrice) {

        if (consumePrice > 200) {
            return 200 + (consumePrice - 200) * 0.8;
        } else {
            return consumePrice;
        }
    }
}
