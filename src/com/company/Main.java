package com.company;

import com.company.creational.builder_patter.MuseumTicket;
import com.company.creational.prototype_pattern.Record;
import com.company.creational.prototype_pattern.Statement;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        prototypeExample();
    }

    public static void prototypeExample() {
        String sql = "select * from movies where title = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("Star Wars");
        Record record = new Record();
        Statement firstStatement = new Statement(sql, parameters, record);
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());

        Statement secondStatement = firstStatement.clone();
        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());
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
