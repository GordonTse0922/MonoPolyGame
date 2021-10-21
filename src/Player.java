import java.util.ArrayList;
import java.util.List;

public class Player {
    private int position;
    private int playerId;
    private boolean broke;
    private List<PropertySquare> properties;
    private CapitalController capital;
    boolean inJail;

    public Player(int id){
        playerId=id;
        position=0;
        capital = new CapitalController(new Capital());
        properties= new ArrayList<>();
        inJail=false;
    }

    public int getPosition(){
        //TODO return current position
        return position;
    }

    public void setPosition(int position) {this.position=position;}

    public void setBroke(boolean flag) {this.broke=flag;}

    public void addCapital(int amount) {capital.add(amount);}

    public void addProperty(PropertySquare property){
        properties.add(property);
    }

    public void setInJail(){
        inJail=true;
    }

    public void setOutJail(){
        inJail=false;
    }

    public int getId(){
        return playerId;
    }

    public int getCapital(){
        return capital.getMoney();
    }

    public boolean getBroke(){
        return broke;
    }

    public List<PropertySquare> getProperties(){
        return properties;
    }
}
