import java.util.Random;

public class Die {
    private int faces;
    private Random rand;

    public Die(){
        faces=4;
        rand= new Random();
    }

    public int toss(){
        int total = rand.nextInt(faces)+ rand.nextInt(faces);
        return total;
    }
}
