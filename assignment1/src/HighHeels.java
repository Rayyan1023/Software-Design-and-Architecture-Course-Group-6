package com.company;

// Creating class for High Heels and extending it to the Shoe Class
class HighHeels extends Shoe {
    HighHeels(Price price) {
        super(ShoeType.HIGHHEELS, price);
        construct();
    }

    @Override
    protected void construct () {

    }
}

