package com.company;

abstract class Shoe {
    Shoe(ShoeType model, Price price) {
        this.model = model;
        this.price = price;
    }
     abstract void construct();

    ShoeType model = null;
    Price price = null;

    ShoeType getModel() {
        return model;
    }

    void setModel(ShoeType model) {
        this.model = model;
    }

    Price getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Shoe Type - " + model + " price is: " +price;
    }
}
