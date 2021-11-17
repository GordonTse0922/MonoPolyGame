package Controller;
import  Model.Capital;
import View.CapitalView;

public class CapitalController {
    private Capital capital;
    private CapitalView view;

    public CapitalController(Capital model, CapitalView view ){
        capital=model;
        view=view;
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

    public void showUpdate(){

        view.printUpdate();
    }

}
