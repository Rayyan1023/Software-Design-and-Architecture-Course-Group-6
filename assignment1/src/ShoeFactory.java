package com.company;

class ShoeFactory {
    public static Shoe buyShoe(ShoeType model) {
        Shoe shoe = null;
        switch(model) {
            case RUNNING:
                shoe = new Running(Price.$40);
                break;

            case SLIPPERS:
                shoe = new Slippers(Price.$20);
                break;
        }
        return shoe;
    }
}
