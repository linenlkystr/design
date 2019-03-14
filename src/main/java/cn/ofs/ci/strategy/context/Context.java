package cn.ofs.ci.strategy.context;

import cn.ofs.ci.strategy.strategy.Strategy;

import java.math.BigDecimal;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double cul(double consumePrice) {

        double realPrice = this.strategy.realPrice(consumePrice);

        BigDecimal bd = new BigDecimal(realPrice);
        bd = bd.setScale(1, BigDecimal.ROUND_DOWN);
        return bd.doubleValue();
    }
}
