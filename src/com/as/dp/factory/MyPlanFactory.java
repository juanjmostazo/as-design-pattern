package com.as.dp.factory;

public abstract class MyPlanFactory {

    public static APlan buildPlan(String type) {
        if (type.equals("DEFAULT")) {
            return new DefaultPlan();
        } else if (type.equals("STUDENT")) {
            return new StudentPlan();
        } else {
            throw new IllegalArgumentException("Unknown Plan");
        }
    }
}
