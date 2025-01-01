package com.example.Exercise_2;


class Truck extends Vehicle {
    private int maxLoad;

    public Truck(double price, int maxSpeed, int maxLoad) {
        super(price, maxSpeed);
        this.maxLoad = maxLoad;
    }

    public Truck() {}

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Max Load: " + maxLoad + " kg";
    }
}
