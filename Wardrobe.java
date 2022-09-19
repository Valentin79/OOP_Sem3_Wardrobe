import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    static private Integer countId = 0;
    private Integer id;
    private EnumColor color;
    private List<String> itemList;
    private boolean isOpen;

    public Integer getId(){
        return id;
    }

    public EnumColor getColor() {
        return color;
    }

    public Wardrobe(EnumColor color) {
        this.id = ++countId;
        this.color = color;
        this.itemList = new ArrayList<>();
        this.isOpen = false;
    }

    public void addItem(String item){
        itemList.add(item);
    }

    public List<String> getItemList() {
        return itemList;
    }

    public List<String> pullAllItemsOut(){
        List<String> result = new ArrayList<>(getItemList());
        itemList.clear();
        return result;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open){
        isOpen = open;
    }

    public EnumColor getWardrobeColor() {
        return color;
    }
    @Override
    public String toString(){
        return "Wardrobe: " + getWardrobeColor().name();
    }
}
