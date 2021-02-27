package com.company;

import com.company.builder_patter.LunchOrder;
import com.company.builder_patter.MuseumTicket;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    }

    public static void implementBuilder() {
        HashMap<String, String> ticketSpecs = new HashMap<>();
        ticketSpecs.put("name", "Lions High School Tour");
//        ticketSpecs.put("aquarium", "8");
//        ticketSpecs.put("art", "7");
//        ticketSpecs.put("history", "10");
        ticketSpecs.put("science", "9");
        ticketSpecs.put("tech", "4");

        makeMuseumTicket(ticketSpecs);
    }

    public static void makeMuseumTicket(HashMap<String, String> userSelections) {
        MuseumTicket.Builder builder =
                new MuseumTicket.Builder(userSelections.get("name"));
        MuseumTicket ticket = builder
                .aquarium(userSelections.get("aquarium"))
                .art(userSelections.get("art"))
                .history(userSelections.get("history"))
                .science(userSelections.get("science"))
                .tech(userSelections.get("tech")).build();
        System.out.println(ticket);
    }
}
