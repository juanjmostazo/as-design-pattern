package com.as.dp.factory;

public class MyPlanFactory {

    public static APlan build(String type) {
        if (type.equals("DEFAULT")) {
            return new DefaultPlan();
        } else if (type.equals("STUDENT")) {
            return new StudentPlan();
        } else {
            throw new IllegalArgumentException("Unknown Plan");
        }
    }
}
