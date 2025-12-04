package PrinciplesOfOOP;

public class Herbivorous extends Terrestrial implements Answer {
    public static double size;
    public static String diet;
    public static String movement;
    public Herbivorous(String type, String name, String attributes, String habitat, double size, String diet, String movement){
        super(type, name, attributes, habitat);
        this.size = size;
        this.diet = diet;
        this.movement = movement;
    }
    public static void printDetails(){
        System.out.println("Type: "+ Terrestrial.type+" Name: "+ Creature.name+" Attribute: "+ Creature.attribute+" Habitat: "+ Creature.habitat+" Size: "+size+" Diet: "+diet+" Movement: "+movement);
    }

    @Override
    public void showAnswer() {
        Herbivorous.printDetails();
    }
}
