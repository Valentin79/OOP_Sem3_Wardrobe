public class ServiceKey implements ActionKey{


    @Override
    public void giveKeyToHuman(Human human, Key key) {
        human.addKey(key);
    }

    public boolean checkKeyForWardrobe(Key key, Wardrobe wardrobe){
        return (key.getKeyColor().name() == wardrobe.getWardrobeColor().name());

    }
}
