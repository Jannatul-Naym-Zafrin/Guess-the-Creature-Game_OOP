package PrinciplesOfOOP;

public class Fish extends Water implements Answer {
    double size;
    String diet;
    String movement;
    public Fish(String type, String name, String attribute, String habitat){
        super(type, name, attribute, habitat);
        this.size = size;
        this.diet = diet;
        this.movement = movement;
    }
    public static void printDetails(){
        System.out.println("Type: "+ Water.type+" Name: "+ Creature.name+" Attribute: "+ Creature.attribute+" Habitat: "+ Creature.habitat);
    }

    @Override
    public void showAnswer() {

        Fish.printDetails();
    }
}
