
/**
 * Write a description of class VirtualPet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class VirtualPet {

    private String name;
    private int health;
    private int hunger;
    private int rest;
    private int money;
    private int mood;
    private int age;
    private int type;

    // Constructor
    public VirtualPet(String name, int type) {
        this.name = name;
        this.health = 60;
        this.hunger = 40;
        this.rest = 50;
        this.money = 50;
        this.mood = 50;
        this.age = 0;
        this.type = 1;
    }

    // --- Actions ---
    public void work() {
        money += 20;
        health -= 10;
        mood -= 20;
        hunger += 10;
        
    }

    public void sleep() {
        rest += 30;
        health += 5;
        hunger += 10;
        money -= 10;
        
    }

    public void eat() {
        hunger -= 30;
        health += 5;
        money -= 20;
        
    }

    public void play() {
        mood += 20;
        health += 5;
        rest -= 15;
        hunger += 10;
      
    }

    public void passTime() {
        hunger += 10;
        mood -= 5;
        health -= 5;
        age++;
        
    }

 

    public boolean isDead() {
            if(health <=0 || hunger >100 || hunger <= 0 
            || (money <=0 && mood <=0))
                return true;
                
            return false;
            
    }
 private static String printRabbit() {
        return
            "RABBIT:\n" +
            " (\\_/)\n" +
            " (._.)\n" +
            " /   \\\n";
    }

    private static String printDog() {
        return
            "DOG:\n" +
            " /^ ^\\\n" +
            " / 0 0 \\\n" +
            " V\\ Y /V\n" +
            "  / - \\\n" +
            " |     \\\n" +
            " ||     \\\n";
    }

    private static String printCat() {
        return
            "CAT:\n" +
            " /\\_/\\\n" +
            "( o.o )\n" +
            " > ^ <\n";
    }

    private static String printMouse() {
        return
            "MOUSE:\n" +
            " ()_()\n" +
            " ('.')\n" +
            " /    \\\n";
    }

    private static String printBear() {
        return
            "BEAR:\n" +
            " (''.')\n" +
            "(  ..  )\n" +
            " (----)\n";
    }

    private static String printBird() {
        return
            "BIRD:\n" +
            "  \\\\  //\n" +
            " ( 'v' )\n" +
            "  /   \\\n" +
            " (_____)\n";
    }
 
    public String toString() {
        String animalPic ="";
        switch(type){
            case 1 -> animalPic = printRabbit();
            case 2 -> animalPic = printDog();
            case 3 -> animalPic = printCat();
            case 4 -> animalPic = printBear();
            case 5 -> animalPic = printBird();
        }
        return "Virtual Pet: " + name +
                 animalPic +
               "\nHealth: " + health +
               "\nHunger: " + hunger +
               "\nRest: " + rest +
               "\nWealth: " + money +
               "\nMood: " + mood +
               "\nAge: " + age;
    }
}
