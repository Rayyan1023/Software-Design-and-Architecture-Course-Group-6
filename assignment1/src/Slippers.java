package com.company;

// Creating class for Slippers and extending it to the Shoe Class
class Slippers extends Shoe {
    Slippers(Price price) {
        super(ShoeType.SLIPPERS, price);
        construct();
    }

    @Override
    protected void construct () {

    }
}
