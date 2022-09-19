import java.util.List;

public class ServiceWardrobe implements ActionWardrobe{
    @Override
    public void open(){
        System.out.println("Шкаф открыт");
    }

    @Override
    public void close() {
        System.out.println("Шкаф закрыт");
    }


    @Override
    public boolean isOpen(Wardrobe wardrobe) {
        return wardrobe.isOpen();
    }

    public void putItem(Wardrobe wardrobe, Human human, String item){
        wardrobe.addItem(item);
    }

    static List<String> takeItemAll(Wardrobe wardrobe, Human human){
        return wardrobe.pullAllItemsOut();
    }

    public void putItem2(Wardrobe wardrobe, Human human, String item){
        if(human.getKeyList().isEmpty()){
            System.out.println("У " + human + " нет ключей");
        }
        for (Key key : human.getKeyList()) {
            if((key.getKeyColor().name() == wardrobe.getWardrobeColor().name())){
                wardrobe.addItem(item);
                System.out.println(human + "положил " + item + " в " + wardrobe.getWardrobeColor().name() +" шкаф");
                System.out.println("Теперь в шкафу: " + wardrobe.getItemList());
                break;
            }
            else {
                System.out.println("Не тот ключ");
            }
        }
    }

    public void takeItem(Wardrobe wardrobe, Human human, String item){
        if(human.getKeyList().isEmpty()){
            System.out.println("У " + human + " нет ключей");
        }
        for (Key key : human.getKeyList()) {
            if((key.getKeyColor().name() == wardrobe.getWardrobeColor().name())){
                for(String i : wardrobe.getItemList()){
                    if(item.equals(i)){
                        wardrobe.getItemList().remove(item);
                        System.out.println(human + "взял " + item + " из " + wardrobe.getWardrobeColor().name() +" шкафа");
                        System.out.println("Теперь в шкафу: " + wardrobe.getItemList());
                        break;
                    }
                    else {
                        System.out.println("Не тот предмет");
                    }
                }
            }
        }
    }
}