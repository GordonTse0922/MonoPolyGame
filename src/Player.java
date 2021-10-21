public class Player {
    int position;
    int playerId;
    boolean broke;
    Capital capital;

    public Player(int id){
        playerId=id;
        position=0;
        capital = new Capital();
    }

    public int getPosition(){
        //TODO return current position
        return position;
    }

    public void setPosition(int position) {this.position=position;}

    public void setBroke(boolean flag) {this.broke=flag;}

    public void addCapital(int amount) {capital.add(amount);}

    public int getId(){
        return playerId;
    }

    public Capital getCapital(){
        return capital;
    }

    public boolean getBroke(){
        return broke;
    }

}
