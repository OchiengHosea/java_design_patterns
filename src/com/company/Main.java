package com.company;

import com.company.builder_patter.LunchOrder;

import java.util.HashMap;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").dressing("Mayo").meat("Turkey");
        builder.condiments("ds");
        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder);
    }

    public static void makeOrder(Optional<HashMap<String, String>> userSelections) {
//        userSelections.no
    }
}
