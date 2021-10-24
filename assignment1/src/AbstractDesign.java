package com.company;

class AbstractDesign {
    public static void main(String[] args) {

        // Outputs all shoe types and their respective prices
        System.out.println(ShoeFactory.buyShoe(ShoeType.RUNNING));
        System.out.println(ExpensiveShoesFactory.buyShoe(ShoeType.HIGHHEELS));
        System.out.println(ExpensiveShoesFactory.buyShoe(ShoeType.DRESS));
        System.out.println(ShoeFactory.buyShoe(ShoeType.SLIPPERS));
    }
}
