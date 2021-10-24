package com.company;

// Creating class for Running shoes and extending it to the Shoe Class
class Running extends Shoe {
    Running(Price price) {
        super(ShoeType.RUNNING, price);
        construct();
    }

    @Override
    protected void construct () {

    }
}
