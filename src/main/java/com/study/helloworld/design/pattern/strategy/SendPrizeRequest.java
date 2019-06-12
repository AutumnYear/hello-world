package com.study.helloworld.design.pattern.strategy;

/**
 * Created by qiunian on 2019/06/12.
 */
public class SendPrizeRequest {

    private PrizeTypeEnum prizeType;
    private int amount;
    private String userId;

    public SendPrizeRequest() {
    }

    public SendPrizeRequest(PrizeTypeEnum prizeType, int amount, String userId) {
        this.prizeType = prizeType;
        this.amount = amount;
        this.userId = userId;
    }

    public PrizeTypeEnum getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(PrizeTypeEnum prizeType) {
        this.prizeType = prizeType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
