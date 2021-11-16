package View;

import Controller.PropertySquareController;
import Controller.SquareController;

public class GameView {
    public void printMap(SquareController[] squareControllers){
        System.out.println();
        for (int i = 0; i<4; i++){
            String square1 = new String();
            String square2 = new String();
            String square3 = new String();
            String square4 = new String();
            String square5 = new String();

            System.out.print("============================================================================\n");
            for (int j = 0; j<5; j++){
                int num1 = i*5+1;
                int num2 = i*5+2;
                int num3 = i*5+3;
                int num4 = i*5+4;
                int num5 = i*5+5;

                switch (j+1){
                    case 1:
                        square1 = String.format("%-" + 10 + "s", " ");
                        square2 = String.format("%-" + 10 + "s", ((PropertySquareController)squareControllers[num2-1]).getColorBand());
                        if (i != 2) {
                            square3 = String.format("%-" + 10 + "s", ((PropertySquareController)squareControllers[num3 - 1]).getColorBand());
                        } else {
                            square3 = String.format("%-" + 10 + "s", " ");
                        }
                        if (i != 2) {
                            square4 = String.format("%-" + 10 + "s", " ");
                        } else {
                            square4 = String.format("%-" + 10 + "s", ((PropertySquareController)squareControllers[num4 - 1]).getColorBand());
                        }
                        square5 = String.format("%-" + 10 + "s", ((PropertySquareController)squareControllers[num5-1]).getColorBand());

                        String num1S = String.format("%-" + 3 + "s", String.valueOf(num1));
                        String num2S = String.format("%-" + 3 + "s", String.valueOf(num2));
                        String num3S = String.format("%-" + 3 + "s", String.valueOf(num3));
                        String num4S = String.format("%-" + 3 + "s", String.valueOf(num4));
                        String num5S = String.format("%-" + 3 + "s", String.valueOf(num5));

                        square1 = num1S.concat(square1);
                        square2 = num2S.concat(square2);
                        square3 = num3S.concat(square3);
                        square4 = num4S.concat(square4);
                        square5 = num5S.concat(square5);

                        break;
                    case 2:
                        square1 = String.format("%-" + 13 + "s", squareControllers[num1-1].getSquareName());
                        square2 = String.format("%-" + 13 + "s", squareControllers[num2-1].getSquareName());
                        square3 = String.format("%-" + 13 + "s", squareControllers[num3-1].getSquareName());
                        square4 = String.format("%-" + 13 + "s", squareControllers[num4-1].getSquareName());
                        square5 = String.format("%-" + 13 + "s", squareControllers[num5-1].getSquareName());

                        break;

                    case 3:
                        square1 = String.format("%-" + 13 + "s", " ");
                        square2 = String.format("%-" + 13 + "s", ((PropertySquareController)squareControllers[num2-1]).getPropertyCost());
                        if (i != 2) {
                            square3 = String.format("%-" + 13 + "s", ((PropertySquareController)squareControllers[num3 - 1]).getPropertyCost());
                        } else {
                            square3 = String.format("%-" + 13 + "s", " ");
                        }
                        if (i != 2) {
                            square4 = String.format("%-" + 13 + "s", " ");
                        } else {
                            square4 = String.format("%-" + 13 + "s", ((PropertySquareController)squareControllers[num4 - 1]).getPropertyCost());
                        }
                        square5 = String.format("%-" + 13 + "s", ((PropertySquareController)squareControllers[num5-1]).getPropertyCost());

                        break;

                    case 4:
                        square1 = String.format("%-" + 13 + "s", " ");
                        square2 = String.format("%-" + 13 + "s", ((PropertySquareController)squareControllers[num2-1]).getPropertyRent());
                        if (i != 2) {
                            square3 = String.format("%-" + 13 + "s", ((PropertySquareController)squareControllers[num3 - 1]).getPropertyRent());
                        } else {
                            square3 = String.format("%-" + 13 + "s", " ");
                        }
                        if (i != 2) {
                            square4 = String.format("%-" + 13 + "s", " ");
                        } else {
                            square4 = String.format("%-" + 13 + "s", ((PropertySquareController)squareControllers[num4 - 1]).getPropertyRent());
                        }
                        square5 = String.format("%-" + 13 + "s", ((PropertySquareController)squareControllers[num5-1]).getPropertyRent());

                        break;
                    case 5:
                        square1 = String.format("%-" + 13 + "s", " ");
                        square2 = String.format("%-" + 13 + "s", ((PropertySquareController)squareControllers[num2-1]).getPropertyOwner());
                        if (i != 2) {
                            square3 = String.format("%-" + 13 + "s", ((PropertySquareController)squareControllers[num3 - 1]).getPropertyOwner());
                        } else {
                            square3 = String.format("%-" + 13 + "s", " ");
                        }
                        if (i != 2) {
                            square4 = String.format("%-" + 13 + "s", " ");
                        } else {
                            square4 = String.format("%-" + 13 + "s", ((PropertySquareController)squareControllers[num4 - 1]).getPropertyOwner());
                        }
                        square5 = String.format("%-" + 13 + "s", ((PropertySquareController)squareControllers[num5-1]).getPropertyOwner());

                        break;
                }

                String Divide = "| ";
                String nextline = "\n";
                String line3 = Divide.concat(square1);
                line3 = line3.concat(Divide);
                line3 = line3.concat(square2);
                line3 = line3.concat(Divide);
                line3 = line3.concat(square3);
                line3 = line3.concat(Divide);
                line3 = line3.concat(square4);
                line3 = line3.concat(Divide);
                line3 = line3.concat(square5);
                line3 = line3.concat(Divide);
                line3 = line3.concat(nextline);
                System.out.print(line3);
            }
        }
        System.out.print("============================================================================\n");
    }

    public void printTurnQuestion(int turns){
        System.out.println("This is turn: " + turns);
        System.out.println("What action you want to do");
        System.out.println("1) Toss Dice");
    }

    public void printWrongInput(){
        System.out.println("Wrong Input");
    }

    public void printWrongPos(){
        System.out.println("Wrong Pos");
    }

    public void printPlayerPosition(int playerNum, int pos){
        System.out.println("Player " + playerNum + ". You are in Square No.: " + pos + ".");
    }

    public void printPlayerStatus(int playerNum, int pos, int capital, boolean jail, int jailDice){
        System.out.println("Player " + playerNum + ". You are in Square No.: " + pos + ".");
        System.out.println("Money : $" + capital);
        System.out.println("Jailed: " + jail);
        System.out.println("DiceJa: " + jailDice);
    }

    public void printTurnsLimit(){
       System.out.println("Turns reached 100 rounds, Game End.");
    }

    public void printOnePlayerLeft(int winner){
        System.out.println("Only one Player left. Player " + winner + " is the winner.");
    }

    public void printBuyProperty(String propertyName, int propertyCost) {
        System.out.println(propertyName + " is owned by no one. Do you want to buy " + propertyName);
        System.out.println("1) Buy (-" + propertyCost + ")");
        System.out.println("2) Leave");
    }

    public void printPayRent(String propertyName, int owner, int rent){
        System.out.println(propertyName + " is owned by Player " + owner + ". You have to pay rent $" + rent);
    }

    public void printFreeParking(){
        System.out.println("Free Parking. No effect.");
    }

    public void printJustVisit(){
        System.out.println("You visited the Jail. No effect.");
    }

    public void printPassGo() {
        System.out.println("You Passed the Go Sqaure. You earned $1500.");
    }
}
