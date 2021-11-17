package View;

import View.SquareView;

public class PropertySquareView extends SquareView {
    public void printPayRent(String propertyName, int owner, int rent){
        System.out.println(propertyName + " is owned by Player " + owner + ". You have to pay rent $" + rent);
    }

    public void printYourProperty(String propertyName){
        System.out.println(propertyName + " is owned by You. No effect");
    }

    public void printBuyProperty(String propertyName, int propertyCost) {
        System.out.println(propertyName + " is owned by no one. Do you want to buy " + propertyName);
        System.out.println("1) Buy (-" + propertyCost + ")");
        System.out.println("2) Leave");
    }
}
