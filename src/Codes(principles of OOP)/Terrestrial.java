package PrinciplesOfOOP;

public class Terrestrial extends Creature {
    public static String type;
    public Terrestrial(String type, String name, String attributes, String habitat){
        super(name, attributes, habitat);
        this.type = type;
    }
}
