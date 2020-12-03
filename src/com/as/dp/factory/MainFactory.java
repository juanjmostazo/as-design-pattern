package com.as.dp.factory;

public class MainFactory {

    public static void main (String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("PLAN TYPE is missing");
        }

        String planType = args[0].toUpperCase();

        if (args.length == 1) {
            throw new IllegalArgumentException("Price is missing");
        }

        String priceString = args[1].toUpperCase();
        float price = Float.parseFloat(priceString);

        /***
         *
         */
        System.out.println("Plan Type: " + planType);
        System.out.println("Price: " + price);

        /***
         * Traditional
         */
        APlan planT;

        if (planType.equals("DEFAULT")) {
            planT = new DefaultPlan();
        } else if (planType.equals("STUDENT")) {
            planT = new StudentPlan();
        } else {
            throw new IllegalArgumentException("Unknown Plan");
        }

        System.out.println("Price (Traditional): " + planT.calculateFinalPrice(price));

        /***
         * Design Pattern
         */
        APlan plan = MyPlanFactory.build(planType);
        System.out.println("Price (DP): " + plan.calculateFinalPrice(price));
    }
}
