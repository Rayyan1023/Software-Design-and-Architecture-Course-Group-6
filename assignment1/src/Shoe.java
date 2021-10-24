package com.company;

abstract class Shoe {
    Shoe(ShoeType model, Price price) {

        this.model = model;
        this.price = price;
    }
     abstract void construct();

    ShoeType model = null;
    Price price = null;

    // Fetches SHoe type and returns it
    ShoeType getModel() {
        return model;
    }

    void setModel(ShoeType model) {
        this.model = model;
    }
     // Fetches Shoe price and returns it
    Price getPrice() {
        return price;
    }

    // Output
    @Override
    public String toString() {
        return "Shoe Type - " + model + " price is: " +price;
    }
}
