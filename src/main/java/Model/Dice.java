package Model;

import java.util.Random;

public class Dice {
    private int faces=4;
    private int name;
    private Random rand;

    public Dice(int name){
//        faces=4;
        this.name = name;
        rand= new Random();
    }

    public int toss(){
        int total =1+ rand.nextInt(faces-1);
        return total;
    }

    public int getName(){
        return name;
    }
}
