package PrinciplesOfOOP;

import GUI.*;

public class Main {
    public static void main(String[] args) {


       Welcome welcome = new Welcome();



                Fish dolphin = new Fish("PrinciplesOfOOP.Fish", "Dolphin", "Aquatic", "PrinciplesOfOOP.Water");
                Fish shark = new Fish("PrinciplesOfOOP.Fish", "Shark", "Aquatic", "PrinciplesOfOOP.Water");

                Mollusca octopus = new Mollusca("PrinciplesOfOOP.Mollusca", "Octopus", "Camouflage", "Carnivorous", "Jet propulsion.");
                //PrinciplesOfOOP.Mollusca obj4 = new PrinciplesOfOOP.Mollusca("PrinciplesOfOOP.Mollusca", "Squid", "Aquatic", "PrinciplesOfOOP.Fish, crustaceans", "Swimming" );

                Crustacean crab = new Crustacean("PrinciplesOfOOP.Crustacean", "Crab ", "Powerful claws", "Rocky coastlines", 20,"Carnivorous","Walking, crawling");
                Crustacean shrimp = new Crustacean("PrinciplesOfOOP.Crustacean", "Shrimp ", "Transparent exoskeleton", "Freshwater and marine environments", 5, "Omnivorous", "Swimming, walking");

                Insect butterfly = new Insect("PrinciplesOfOOP.Insect", "Butterfly", "Metamorphosis", "Meadows & grassland");
                Insect ant = new Insect("PrinciplesOfOOP.Insect", "Ant", "Social insects", "Forests, grasslands, and deserts");

                Reptile turtle = new Reptile("PrinciplesOfOOP.Reptile", "Turtle", "Hard shell", "Land & water");
                Reptile lizard = new Reptile("PrinciplesOfOOP.Reptile", "Lizard", "Scales", "Warm, dry places");

                Carnivorus lion = new Carnivorus("Carnivorous", "Lion", "Large mane & powerful roar", "Savannas, grasslands, woodlands, forests", 420, "Carnivorous", "Active, hunt at night, good climbers");
                Carnivorus leopards = new Carnivorus("Carnivorous", "Leopards", "Rosette-patterned coat", "Tropical forests, rainforests, savannas, grasslands", 160, "Carnivorous", "Fast, stealthy, nocturnal hunters");

                Herbivorous cow = new Herbivorous("Mammal", "cow", "Strong hooves", "Grasslands, meadows, and plains", 1100, "PrinciplesOfOOP.Herbivorous", "leisurely walking and grazing behavior");
                Herbivorous deer = new Herbivorous("Mammal", "Deer", "Antlers", "Forests, woodlands, and grasslands", 150, "PrinciplesOfOOP.Herbivorous", "Grazing, browsing, leaping");







            switch (Guess.getIndex()){

                case 0:
                    dolphin.showAnswer();
                    break;
                case 1:
                    shark.showAnswer();
                    break;
                case 2:
                    octopus.showAnswer();
                    break;
                case 3:
                    crab.showAnswer();
                    break;
                case 4:
                    shrimp.showAnswer();
                    break;
                case 5:
                    butterfly.showAnswer();
                    break;
                case 6:
                    ant.showAnswer();
                    break;
                case 7:
                    turtle.showAnswer();
                    break;
                case 8:
                    lizard.showAnswer();
                    break;
                case 9:
                    lion.showAnswer();
                    break;
                case 10:
                    leopards.showAnswer();
                    break;
                case 11:
                    deer.showAnswer();
                    break;
                case 12:
                    cow.showAnswer();
                    break;

        }

                //dolphin.printDetails();
                //shark.printDetails();
                //octopus.printDetails();
                //obj4.printDetails();
                //lobsters.printDetails();
                //shrimp.printDetails();
                //butterfly.printDetails();
                //ant.printDetails();
                //turtle.printDetails();
                //lizard.printDetails();
                //lion.printDetails();
                //leopards.printDetails();
                // horse.printDetails();
                //deer.printDetails();

            }
        }

       // GUI.SelectionArray.checkArray();


