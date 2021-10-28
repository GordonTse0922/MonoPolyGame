package Model;

import java.util.Map;

import static java.util.Map.entry;

public class Capital {
    private int money;
    public Capital(){
        this.money=1500;
    }

    public int getMoney(){
        return money;
    }

    public void addMoney(int amount){money+=amount;}

    public void deductMoney(int amount){money-=amount;}

    public static class PropertySquare extends Square {
        private int owner;
        private int cost;
        private static final Map<Integer, Integer> map = Map.ofEntries(
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

        public PropertySquare () {
            super();
        }

        public PropertySquare (String name, int index) {
            super(name, index);
            owner=0;
            cost=map.get(index);
        }

        public boolean isOwned(){
            return false;
        }

        public void setOwner(int playerId){
            owner=playerId;
        }

        public int getCost(){
            return 1;
        }
    }
}