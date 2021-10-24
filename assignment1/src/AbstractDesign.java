package com.company;

class AbstractDesign {
    public static void main(String[] args) {

        // Outputs a
        System.out.println(ShoeFactory.buyShoe(ShoeType.RUNNING));
        System.out.println(ExpensiveShoesFactory.buyShoe(ShoeType.HIGHHEELS));
        System.out.println(ExpensiveShoesFactory.buyShoe(ShoeType.DRESS));
        System.out.println(ShoeFactory.buyShoe(ShoeType.SLIPPERS));
    }
}
