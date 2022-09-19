public class Key {
    private EnumColor color;

    public EnumColor getKeyColor() {
        return color;
    }

    public Key(EnumColor color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Key: " + getKeyColor().name();
    }
}
