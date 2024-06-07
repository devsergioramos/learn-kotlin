package com.sergio.ramos;

import java.io.IOException;

public class TalkingToKotlin {
    public void loadStats(CustomerKotlin customerKotlin) {
        try {
            customerKotlin.loadStatistics("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello from Java");
        System.out.println("Calling Kotlin");

        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Sergio", "sergio2024@gmail.com", null);

        customerKotlin.getEmail();
        customerKotlin.setId(1010);
        String value = customerKotlin.someProperty;

        customerKotlin.changeStatus(Status.ACTIVE);
        customerKotlin.changeStatus();

        customerKotlin.preferential();
    }
}
