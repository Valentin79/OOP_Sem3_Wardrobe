import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private List<Key> keyList;
    public Human(String name){
        this.name = name;
        this.keyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Key> getKeyList(){
        return keyList;
    }
    public void addKey(Key key){
        keyList.add(key);
    }

    @Override
    public String toString() {
        return name
                + keyList;
    }


}
