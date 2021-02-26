package com.company;

import com.company.builder_patter.LunchOrder;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").dressing("Mayo").meat("Turkey");
        builder.condiments("ds");
        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder);

        HashMap<String, String> selections = new HashMap<>();
        selections.put("meat", "3");

        makeOrder(selections);
    }

    public static void makeOrder(HashMap<String, String> userSelections) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.condiments(userSelections.get("condiments")).meat(userSelections.get("meat"));
        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder);

    }
}
