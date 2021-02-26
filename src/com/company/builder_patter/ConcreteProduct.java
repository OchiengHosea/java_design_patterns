package com.company.builder_patter;

public class ConcreteProduct {
    public static class Builder {
        private String name; // name of product
        private Integer sand; // kilograms
        private Integer water; // litres
        private Integer gravel; // weight in kgs
        private Integer steel; // length in meters

        public Builder(String name) {
            this.name = name;
        }

        public ConcreteProduct build() {return new ConcreteProduct(this);}

        public Builder sand(Integer sand) {
            this.sand = sand;
            return this;
        }

        public Builder water(Integer water) {
            this.water = water;
            return this;
        }

        public Builder gravel(Integer gravel) {
            this.gravel = gravel;
            return this;
        }


        public Builder steel(Integer steel) {
            this.steel = steel;
            return this;
        }

    }

    private final String name;
    private final Integer sand;
    private final Integer water;
    private final Integer gravel;

    private ConcreteProduct(Builder builder) {
        this.name = builder.name;
        this.sand = builder.sand;
        this.gravel = builder.gravel;
        this.water = builder.water;
    }

    public String getName() {
        return name;
    }

    public Integer getSand() {
        return sand;
    }

    public Integer getWater() {
        return water;
    }

    public Integer getGravel() {
        return gravel;
    }

    @Override
    public String toString() {
        return "ConcreteProduct{" +
                "name='" + name + '\'' +
                ", sand=" + sand +
                ", water=" + water +
                ", gravel=" + gravel +
                '}';
    }
}
