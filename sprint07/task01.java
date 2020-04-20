// Suppose we have the next class:

// Pizza class
// Create public static inner class named PizzaBuilder inside Pizza class that correspond the next class diagram:

// Inside the cook method create and return an instance of Pizza class with your favorite ingredients.

class Pizza {
    private String cheese;
    private String meat;
    private String seafood;
    private String vegetable;
    private String mushroom;


    public Pizza(String cheese, String meat, String seafood, String vegetable, String mushroom) {
        this.cheese = cheese;
        this.meat = meat;
        this.seafood = seafood;
        this.vegetable = vegetable;
        this.mushroom = mushroom;
    }

    private Pizza() { }

    public static class PizzaBuilder{
        
        private PizzaBuilder() {
        }

        public String addCheese(String cheese) {
            return cheese;
        }

        public String addMeat(String meat) {
            return meat;
        }

        public String addSeafood(String seafood) {
            return seafood;
        }

        public String addVegetable(String vegetable) {
            return vegetable;
        }

        public String addMushroom(String mushroom) {
            return mushroom;
        }

        public Pizza build(){
            return new Pizza();
        }

    }

    public static PizzaBuilder base() {
        return new PizzaBuilder();
    }



}

class Oven {
    public static Pizza cook() {


        return new Pizza("sgad", "fsdsgf", "sdfgdf", "adfsd", "adfsd");

    }
}
