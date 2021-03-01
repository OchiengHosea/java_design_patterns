package com.company.creational.builder_patter;

public class MuseumTicket {
    public static class Builder {
        private final String ticketHolderName;
        private String aquarium;
        private String history;
        private String art;
        private String science;
        private String tech;
        
        public MuseumTicket build() { return new MuseumTicket(this); }
        
        public Builder(String ticketHolderName) {
            this.ticketHolderName = ticketHolderName;
        }

        public Builder aquarium(String aquarium) {
            this.aquarium = aquarium;
            return this;
        }

        public Builder history(String history) {
            this.history = history;
            return this;
        }

        public Builder art(String art) {
            this.art = art;
            return this;
        }

        public Builder tech(String tech) {
            this.tech = tech;
            return this;
        }

        public Builder science(String science) {
            this.science = science;
            return this;
        }

    }
    private final String ticketHolderName;
    private final String aquarium;
    private final String history;
    private final String art;
    private final String science;
    private final String tech;

    private MuseumTicket(Builder builder) {
        this.ticketHolderName = builder.ticketHolderName;
        this.aquarium = builder.aquarium;
        this.history = builder.history;
        this.art = builder.art;
        this.science = builder.science;
        this.tech = builder.tech;
    }

    public String getTicketHolderName() {
        return ticketHolderName;
    }

    public String getAquarium() {
        return aquarium;
    }

    public String getHistory() {
        return history;
    }

    public String getArt() {
        return art;
    }

    public String getScience() {
        return science;
    }

    public String getTech() {
        return tech;
    }

    @Override
    public String toString() {
        return "MuseumTicket{" +
                "ticketHolderName='" + ticketHolderName + '\'' +
                ", aquarium='" + aquarium + '\'' +
                ", history='" + history + '\'' +
                ", art='" + art + '\'' +
                ", science='" + science + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
