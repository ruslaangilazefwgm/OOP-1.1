public class Flower {
    String name;
    private String flowerColour;
    private String country;
    private double cost;
    int lifeSpan;

    Flower(String name, String flowerColour, String country, double cost, int lifeSpan) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Incorrect";
        }

        if (flowerColour != null && !flowerColour.isEmpty()) {
            this.flowerColour = flowerColour;
        } else {
            this.flowerColour = "White";
        }

        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Russia";
        }

        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }

        if (lifeSpan < 0) {
            this.lifeSpan = Math.abs(lifeSpan);
        } else if (lifeSpan == 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    String getName() {
        return name;
    }
    String getFlowerColour() {
        return flowerColour;
    }

    void setFlowerColour(String flowerColour) {
        this.flowerColour = flowerColour;
    }

    String getCountry() {
        return  country;
    }
    void setCountry(String country) {
        this.country = country;
    }

    double getCost() {
        return  cost;
    }

    void setCost(int cost) {
        this.cost =cost;
    }

    int getLifeSpan() {
        return lifeSpan;
    }

    void printFlower() {
        System.out.println("Название: " + getName() + ", " + getFlowerColour() + ", Страна: " + getCountry()
                + ", стоимость " + String.format("%.2f",getCost())
                + ", срок стояния: " + getLifeSpan() + " дня.");
    }
}
