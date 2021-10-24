package com.company;

// Creating class for Dress shoes and extending it to the Shoe Class
class Dress extends Shoe {
    Dress(Price price) {
        super(ShoeType.DRESS, price);
        construct();
    }

    @Override
    protected void construct () {

    }
}
