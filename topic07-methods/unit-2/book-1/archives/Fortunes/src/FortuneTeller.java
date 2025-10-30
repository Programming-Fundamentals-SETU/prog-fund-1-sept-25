public class FortuneTeller {


        // Method 1: No parameters, no return
        public void sayRandomFortune() {
            System.out.println("You're a very lucky person");
        }

        // Method 2: Parameter, no return
        public void personalFortune(String name) {
            System.out.println( "Ah, " + name + ", great adventures await you!");
        }

        // Method 3: Parameter and return value
        public String futurePrediction(int age) {
            age = age +10;
            return "In 10 years time, when you are " + age
                    + " years old, you will be very rich in wisdom";
        }
    }


