public class Player {
    int turns=0;
    int position =0;
    String playerName;
    boolean broke =false;
    Capital capital = new Capital();

    public Player(String name){
        playerName=name;
    }

    public int getPosition(){
        //TODO return current position
        return position;
    }

    public void setPosition(int position) {this.position=position;}

    public void setBroke(boolean flag) {this.broke=flag;}

    public void addCapital(int amount) {capital.add(amount);}

    public String getName(){
        return playerName;
    }

    public Capital getCapital(){
        return capital;
    }

    public boolean getBroke(){
        return broke;
    }

}
