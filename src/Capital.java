public class Capital {
    int money;
    public Capital(){
        this.money=1500;
    }

    public int getMoney(){
        return money;
    }

    public void add(int amount){
        money+=amount;
    }
}
