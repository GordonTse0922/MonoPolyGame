package Model;

import Controller.CapitalController;
import Controller.PropertySquareController;
import Model.Capital;
import View.CapitalView;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int position;
    private int playerId;
    private boolean broke;
    private List<PropertySquareController> properties;
    private CapitalController capital;
    private boolean inJail;
    private int inJailDice;

    public Player(int id){
        playerId=id;
        position=1;
        broke = false;
        inJail = false;
        inJailDice = 3;
        capital = new CapitalController(new Capital(),new CapitalView());
        properties= new ArrayList<>();
//        inJail=false;
    }

    public void setPositionFromSave(int pos){
        position=pos;
    }
    public void setCapitalFromSave(int amount){
        position=amount;
    }
    public void setJailStatusFromSave(int jail){
        inJail=jail==1?true:false;
    }
    public int getPosition(){
        //TODO return current position
        return position;
    }

    public void move(int moves) {
        int temp=this.position+moves;

        if (temp <= 20) {
            if (temp % 21 == 0) {
                this.position = 1;
            } else {
                this.position = temp % 21;
            }
        } else {
            this.position = temp % 21+1;
        }
    }

    public void setBroke(boolean flag) {this.broke=flag;}

    public void addCapital(int amount) {capital.add(amount);}

    public void minusCapital(int amount) {capital.deductMoney(amount);}

    public void addProperty(PropertySquareController property){
        properties.add(property);
    }

    public void setInJail(){
        position = 6;
        inJail=true;
    }

    public void setOutJail(){
        inJail=false;
        inJailDice = 3;
    }

    public void minusInJailDice(){
        inJailDice--;
    }

    public int getInJailDice(){
        return inJailDice;
    }

    public boolean getJailStatus(){return inJail;}

    public int getId(){
        return playerId;
    }

    public int getCapital(){
        return capital.getMoney();
    }

    public boolean getBroke(){
        return broke;
    }

    public List<PropertySquareController> getProperties(){
        return properties;
    }

    public void clearProperty(){
        properties.clear();
    }
}
