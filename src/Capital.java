public class Capital {
    int money;
    public Capital(){
        this.money=1500;
    }

    public int getMoney(){
        return money;
    }

    public void addMoney(int amount){money+=amount;}

    public void deductMoney(int amount){money-=amount;}

}
