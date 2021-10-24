package com.company;

class Dress extends Shoe {
    Dress(Price price) {
        super(ShoeType.DRESS, price);
        construct();
    }

    @Override
    protected void construct () {

    }
}
