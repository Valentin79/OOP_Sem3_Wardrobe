import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Вася");
        Wardrobe wardrobe = new Wardrobe(EnumColor.BLACK);
        Wardrobe wardrobe2 = new Wardrobe(EnumColor.WHITE);
        ServiceWardrobe serviceWardrobe = new ServiceWardrobe();
        serviceWardrobe.putItem(wardrobe2, human, "book");
//        System.out.println(wardrobe.getItemList());
//        System.out.println(ServiceWardrobe.takeItemAll(wardrobe, human));
//        System.out.println(wardrobe.getItemList());
        Key key = new Key(EnumColor.BLACK);
        Key key2 = new Key(EnumColor.WHITE);
        ServiceKey serviceKey = new ServiceKey();
        serviceKey.giveKeyToHuman(human, key);
        serviceKey.giveKeyToHuman(human, key2);
//        System.out.println(serviceKey.checkKeyForWardrobe(key2, wardrobe));
//        System.out.println(human);
//        System.out.println(human2);
        System.out.println(wardrobe2.getItemList());
        serviceWardrobe.putItem2(wardrobe2, human, "box");
        serviceWardrobe.takeItem(wardrobe2, human, "box");

    }
}
