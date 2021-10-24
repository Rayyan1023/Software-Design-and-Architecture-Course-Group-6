package com.company;

class ExpensiveShoesFactory {
    static Shoe buyShoe(ShoeType model) {
        Shoe shoe = null;
        switch (model) {
            case DRESS:
                shoe = new Dress(Price.$100);
                break;

            case HIGHHEELS:
                shoe = new HighHeels(Price.$80);
                break;
        }
        return shoe;
    }
}
