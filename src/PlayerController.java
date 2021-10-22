public class PlayerController {
    private Player player;
    private PlayerView view;

    public PlayerController(Player model){
        this.player=model;
        view=new PlayerView();
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

    public void buyProperty(PropertySquareController square){
        player.addProperty(square);
    }

    public boolean getBroke(){return player.getBroke();}

    public int getCapital(){
        return player.getCapital();
    }

    public int getName(){
        return player.getId();
    }

    public int getPosition(){
        return player.getPosition();
    }

    public void inJail(){
        player.setInJail();
    }

    public void outJail(){
        player.setOutJail();
    }

    public void udpateStatus(int id){
        int money=player.getCapital();
        int properties=player.getProperties().size();
        view.printPlayerStatus(id,money,properties);
    }
}
