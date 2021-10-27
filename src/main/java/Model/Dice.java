package Model;

import java.util.Random;

public class Dice {
    private int faces;
    private Random rand;

    public Dice(){
        faces=4;
        rand= new Random();
    }

    public int toss(){
        int total = rand.nextInt(faces)+ rand.nextInt(faces);
        return total;
    }
}
