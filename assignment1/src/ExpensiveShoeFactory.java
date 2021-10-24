package com.company;

class ExpensiveShoesFactory {
    static Shoe buyShoe(ShoeType model) {
        Shoe shoe = null;
        switch (model) {
            // Addresses appropriate prices for each expensive shoe (Dress shoes and High Heels)
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
