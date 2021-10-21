import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class Property {
    private int owner;
    private int cost;
    private final Map<Integer, Integer> map = Map.ofEntries(
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

    public void Property(int index){
        owner=0;
        cost=map.get(index);
    }


    public boolean isOwned(){
        return owner==0;
    }
}
