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

    public String futurePrediction(String starSign) {
        String message;

        if (starSign.equalsIgnoreCase("Aries")) {
            message = "Your adventurous spirit will lead you to unexpected fortune.";
        }
        else if (starSign.equalsIgnoreCase("Taurus")) {
            message = "Patience will bring you great rewards in the near future.";
        }
        else if (starSign.equalsIgnoreCase("Gemini")) {
            message = "Exciting opportunities will come through communication.";
        }
        else if (starSign.equalsIgnoreCase("Cancer")) {
            message = "Trust your instincts—they’ll guide you to success.";
        }
        else if (starSign.equalsIgnoreCase("Leo")) {
            message = "Your charisma will open doors you didn’t even know existed.";
        }
        else if (starSign.equalsIgnoreCase("Virgo")) {
            message = "Your attention to detail will pay off in surprising ways.";
        }
        else if (starSign.equalsIgnoreCase("Libra")) {
            message = "Balance will bring harmony and a stroke of good luck.";
        }
        else if (starSign.equalsIgnoreCase("Scorpio")) {
            message = "A mystery will unravel in your favour soon.";
        }
        else if (starSign.equalsIgnoreCase("Sagittarius")) {
            message = "Adventure is calling — and it will lead to joy.";
        }
        else if (starSign.equalsIgnoreCase("Capricorn")) {
            message = "Hard work will finally bring the recognition you deserve.";
        }
        else if (starSign.equalsIgnoreCase("Aquarius")) {
            message = "Your unique ideas will inspire others and shape your future.";
        }
        else if (starSign.equalsIgnoreCase("Pisces")) {
            message = "Creativity will bring unexpected happiness your way.";
        }
        else {
            message = "Hmm... I don't know that star sign, but the future looks bright!";
        }

        return message;
    }

}


