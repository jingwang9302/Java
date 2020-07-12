package com.javaProgram;

public class HealthBuger extends Humbuger {
    public HealthBuger(String rollType, String meat, int price) {
        super(rollType, meat, price);

    }

    @Override
    public void setRollType(String rollType) {
        rollType = "Brown rye";
    }

    @Override
    public void setMeat(String meat) {
        super.setMeat(meat);
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
