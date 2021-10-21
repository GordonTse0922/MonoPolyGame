public class PlayerController {
    private Player player;

    public PlayerController(Player model){
        this.player=model;
    }

    public void setPosition(int pos){
        player.setPosition(pos);
    }

    public void setBroke(){
        player.setBroke(true);
    }

    public void addCapital(int amount){
        player.addCapital(amount);
    }

    public boolean getBroke(){return player.getBroke();}

    public Capital getCapital(){
        return player.getCapital();
    }

    public int getName(){
        return player.getId();
    }

    public int getPosition(){
        return player.getPosition();
    }

}
