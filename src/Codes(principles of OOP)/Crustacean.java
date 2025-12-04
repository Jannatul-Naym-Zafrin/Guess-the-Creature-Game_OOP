package PrinciplesOfOOP;

public class Crustacean extends Water implements Answer {
    public static double size;
    public static String diet;
    public static String movement;

    public Crustacean(String type, String name, String attribute, String habitat, double size, String diet, String movement) {
        super(type, name, attribute, habitat);
        this.size = size;
        this.diet = diet;
        this.movement = movement;
    }
    public static void printDetails(){
        System.out.println("Type: "+ Water.type+" Name: "+ Creature.name+"Attribute: "+ Creature.attribute+" Habitat: "+ Creature.habitat+" Size: "+size+" Diet: "+diet+" Movement: "+movement);
    }

    @Override
    public void showAnswer() {
        Crustacean.printDetails();
    }
}
