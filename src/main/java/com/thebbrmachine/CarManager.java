package com.thebbrmachine;

public class CarManager implements Car {
    private String id;
    private String car_type = null;
    private String model;
    private String colour;
    private double price;
    private int hpower;
    private String key;
    private String parkingSpot;
    private String testKey;

    public CarManager(String id, String car_type, String model, String colour, double price, int hpower) {
        this.id = id;
        this.car_type = car_type;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.hpower = hpower;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHpower() {
        return hpower;
    }

    public void setHpower(int hpower) {
        this.hpower = hpower;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public String getTestKey() {
        return testKey;
    }

    public void setTestKey(String testKey) {
        this.testKey = testKey;
    }


    @Override
    public void getInFo() {
        System.out.println("****** Car Specs ******");
        System.out.println(

                        "Model       : " + this.model +
                        "\nColor       : " + this.colour +
                        "\nHorse Power : " + this.hpower +
                        "\nPrice       : $" + this.price

        );
    }
}

