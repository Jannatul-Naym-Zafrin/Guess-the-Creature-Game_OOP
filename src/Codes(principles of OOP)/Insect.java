package PrinciplesOfOOP;

public class Insect extends Terrestrial implements Answer {
    public Insect(String type, String name, String attributes, String habitat){
        super(type, name, attributes, habitat);
    }
    public static void printDetails(){
        System.out.println("Type: "+ Terrestrial.type+" Name: "+ Creature.name+" Attribute: "+ Creature.attribute+" Habitat: "+ Creature.habitat);
    }

    @Override
    public void showAnswer() {

        Insect.printDetails();
    }
}
