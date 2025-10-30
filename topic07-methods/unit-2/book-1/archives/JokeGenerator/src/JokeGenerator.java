public class JokeGenerator {

    // Method 1: No parameters, no return
    public void tellJoke() {
        System.out.println("Why don’t programmers like nature? It has too many bugs!");
    }

    // Method 2: Parameter, no return
    public void tellStory(String name) {
        System.out.println("Once upon a time, " + name + " tried to debug code at 3am...");
        System.out.println("The bug fixed itself. Legends still talk about it.");
    }

    // Method 3: Parameter and return value
    public String ageInTenYears(int age) {
        if(age <= 10)
            return "not old enough";

        int futureAge = age + 10;
        return "In 10 years, you'll be " + futureAge + " years old — still debugging!";
    }
}

