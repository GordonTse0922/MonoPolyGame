package Model;

import java.util.Random;

public class Dice {
    private int faces=4;
    private Random rand;

    public Dice(){
//        faces=4;
        rand= new Random();
    }

    public int toss(){
        int total =2+ rand.nextInt(faces-1)+rand.nextInt(faces-1);
        return total;
    }
}
