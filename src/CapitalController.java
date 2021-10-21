public class CapitalController {
    private Capital capital;

    public CapitalController(Capital model){
        capital=model;
    }
    public void add(int amount){
        capital.addMoney(amount);
    }
    public int getMoney(){
        return capital.getMoney();
    }

    public void deductMoney(int amount){
        capital.deductMoney(amount);
    }
}
