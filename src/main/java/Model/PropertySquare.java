package Model;

import java.util.Map;

import static java.util.Map.entry;

public class PropertySquare extends Square {
    private int owner;
    private int cost;
    private int rent;
    private String colorBand;

    private static final Map<Integer, Integer> propertyCostMap = Map.ofEntries(
            entry(2, 800),
            entry(3,700),
            entry(5,600),
            entry(7,400),
            entry(8,500),
            entry(10,400),
            entry(12,700),
            entry(14,400),
            entry(15,500),
            entry(17,400),
            entry(18,400),
            entry(20,600)
    );

    private static final Map<Integer, Integer> propertyRentMap = Map.ofEntries(
            entry(2, 90),
            entry(3,65),
            entry(5,60),
            entry(7,10),
            entry(8,40),
            entry(10,15),
            entry(12,75),
            entry(14,20),
            entry(15,25),
            entry(17,10),
            entry(18,25),
            entry(20,25)
    );

    public PropertySquare (String name, int index, String colorBand) {
        super(name, index);
        owner=0;
        this.cost = propertyCostMap.get(index);

        this.rent = propertyRentMap.get(index);
        this.colorBand = colorBand;
    }

    public boolean isOwned(){
        return false;
    }

    public void setOwner(int playerId){
        owner=playerId;
    }

    public int getOwner(){return owner;}

    public int getCost(){
        return cost;
    }

    public int getRent() {
        return rent;
    }

    public String getColorBand(){
        return colorBand;
    }
}