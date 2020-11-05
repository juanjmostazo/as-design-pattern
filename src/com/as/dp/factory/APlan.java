package com.as.dp.factory;

public abstract class APlan {

    public abstract float getDiscount();

    public float calculateFinalPrice(float price) {
        return price - price * getDiscount();
    }
}
