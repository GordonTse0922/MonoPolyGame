package View;

import Controller.PropertySquareController;
import Controller.SquareController;

import java.util.ArrayList;

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
                        String costS = String.format("%-" + 7 + "s", "Cost : ");

                        square1 = String.format("%-" + 13 + "s", " ");

                        square2 = String.format("%-" + 6 + "s", ((PropertySquareController)squareControllers[num2-1]).getPropertyCost());
                        square2 = costS.concat(square2);

                        if (i != 2) {
                            square3 = String.format("%-" + 6 + "s", ((PropertySquareController)squareControllers[num3 - 1]).getPropertyCost());
                            square3 = costS.concat(square3);
                        } else {
                            square3 = String.format("%-" + 13 + "s", " ");
                        }
                        if (i != 2) {
                            square4 = String.format("%-" + 13 + "s", " ");
                        } else {
                            square4 = String.format("%-" + 6 + "s", ((PropertySquareController)squareControllers[num4 - 1]).getPropertyCost());
                            square4 = costS.concat(square4);
                        }

                        square5 = String.format("%-" + 6 + "s", ((PropertySquareController)squareControllers[num5-1]).getPropertyCost());
                        square5 = costS.concat(square5);

                        break;

                    case 4:
                        String rentS = String.format("%-" + 7 + "s", "Rent : ");

                        square1 = String.format("%-" + 13 + "s", " ");

                        square2 = String.format("%-" + 6 + "s", ((PropertySquareController)squareControllers[num2-1]).getPropertyRent());
                        square2 = rentS.concat(square2);

                        if (i != 2) {
                            square3 = String.format("%-" + 6 + "s", ((PropertySquareController)squareControllers[num3 - 1]).getPropertyRent());
                            square3 = rentS.concat(square3);
                        } else {
                            square3 = String.format("%-" + 13 + "s", " ");
                        }
                        if (i != 2) {
                            square4 = String.format("%-" + 13 + "s", " ");
                        } else {
                            square4 = String.format("%-" + 6 + "s", ((PropertySquareController)squareControllers[num4 - 1]).getPropertyRent());
                            square4 = rentS.concat(square4);
                        }

                        square5 = String.format("%-" + 6 + "s", ((PropertySquareController)squareControllers[num5-1]).getPropertyRent());
                        square5 = rentS.concat(square5);

                        break;
                    case 5:
                        String noOwner = String.format("%-" + 6 + "s", "N/A");
                        String ownerS  = String.format("%-" + 8 + "s", "Owner: P");
                        String owner2S = String.format("%-" + 7 + "s", "Owner: ");

                        square1 = String.format("%-" + 13 + "s", " ");

                        if (((PropertySquareController) squareControllers[num2 - 1]).getPropertyOwner() != 0) {
                            square2 = String.format("%-" + 5 + "s", ((PropertySquareController) squareControllers[num2 - 1]).getPropertyOwner());
                            square2 = ownerS.concat(square2);
                        } else {
                            square2 = noOwner;
                            square2 = owner2S.concat(square2);
                        }

                        if (i != 2) {
                            if (((PropertySquareController)squareControllers[num3 - 1]).getPropertyOwner() != 0) {
                                square3 = String.format("%-" + 5 + "s", ((PropertySquareController) squareControllers[num3 - 1]).getPropertyOwner());
                                square3 = ownerS.concat(square3);
                            } else {
                                square3 = noOwner;
                                square3 = owner2S.concat(square3);
                            }
                        } else {
                            square3 = String.format("%-" + 13 + "s", " ");
                        }

                        if (i != 2) {
                            square4 = String.format("%-" + 13 + "s", " ");
                        } else {
                            if (((PropertySquareController) squareControllers[num4 - 1]).getPropertyOwner() != 0) {
                                square4 = String.format("%-" + 5 + "s", ((PropertySquareController) squareControllers[num4 - 1]).getPropertyOwner());
                                square4 = ownerS.concat(square4);
                            } else {
                                square4 = noOwner;
                                square4 = owner2S.concat(square4);
                            }

                        }

                        if (((PropertySquareController) squareControllers[num5 - 1]).getPropertyOwner() != 0) {
                            square5 = String.format("%-" + 5 + "s", ((PropertySquareController) squareControllers[num5 - 1]).getPropertyOwner());
                            square5 = ownerS.concat(square5);
                        } else {
                            square5 = noOwner;
                            square5 = owner2S.concat(square5);
                        }

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
        System.out.println("\nThis is turn: " + turns);
        System.out.println("What action you want to do");
        System.out.println("1) Toss Dice\n2) Save and leave");
    }

    public void printWrongInput(){
        System.out.println("Wrong Input");
    }

    public void printWrongPos(){
        System.out.println("Wrong Pos");
    }

    public void printTurnsLimit(){
       System.out.println("\nTurns reached 100 rounds, Game End.");
    }

    public void printTie(ArrayList<Integer> winner){
        System.out.println("The game is a tie.");
        for (int i = 0; i<winner.size(); i++){
            System.out.println("Congratulations, Player " + winner.get(i));
        }
    }

    public void printOnePlayerLeft(int winner){
        System.out.println("\nOnly one Player left. Player " + winner + " is the winner.");
    }

    public void printTotalMove(int moves) {
        System.out.println("In total you moved " + moves);
    }
}
