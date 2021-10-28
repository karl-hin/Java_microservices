package com.maintest.test2.model;

public class Car {

    private int id;
    private String type;
    private String marque;
    private String color;

    public Car(int id, String type, String marque, String color) {
        this.id = id;
        this.type = type;
        this.marque = marque;
        this.color = color;
    }

    public Car() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", marque='" + marque + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
