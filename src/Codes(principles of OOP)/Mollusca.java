package PrinciplesOfOOP;

public class Mollusca extends Water implements Answer {
    public static String diet;
    public static String movement;
    public Mollusca(String type, String name, String attribute, String diet, String movement) {
        super(type, name, attribute, type);
        this.diet = diet;
        this.movement = movement;
    }
    public static void printDetails(){
        System.out.println("Type: "+ Water.type+" Name: "+ Creature.name+" Attribute: "+ Creature.attribute+" Diet: "+diet+" Movement: "+movement);
    }

    @Override
    public void showAnswer() {
        Mollusca.printDetails();
    }
}

