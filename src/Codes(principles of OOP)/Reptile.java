package PrinciplesOfOOP;

public class Reptile extends Terrestrial implements Answer {
    public Reptile(String type, String name, String attributes, String habitat){
        super(type,name, attributes, habitat);
    }
    public static void printDetails(){
        System.out.println("Type: "+type+" Name: "+name+" Attribute: "+attribute+" Habitat: "+habitat);
    }

    @Override
    public void showAnswer() {
        Reptile.printDetails();
    }
}
