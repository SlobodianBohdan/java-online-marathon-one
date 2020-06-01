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

    private Pizza() {
    }

    public static PizzaBuilder base() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        private Pizza pizza;

        private PizzaBuilder() {
            pizza = new Pizza();
        }

        public PizzaBuilder addCheese(String cheese) {
            pizza.cheese = cheese;
            return this;
        }

        public PizzaBuilder addMeat(String meat) {
            pizza.meat = meat;
            return this;
        }

        public PizzaBuilder addSeafood(String seafood) {
            pizza.seafood = seafood;
            return this;
        }

        public PizzaBuilder addVegetable(String vegetable) {
            pizza.vegetable = vegetable;
            return this;
        }

        public PizzaBuilder addMushroom(String mushroom) {
            pizza.mushroom = mushroom;
            return this;
        }

        public Pizza build() {
            return pizza;
        }

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese='" + cheese + '\'' +
                ", meat='" + meat + '\'' +
                ", seafood='" + seafood + '\'' +
                ", vegetable='" + vegetable + '\'' +
                ", mushroom='" + mushroom + '\'' +
                '}';
    }
}

class Oven {

    public Oven() {
    }

    public static Pizza cook() {


        return Pizza.base()
                .addCheese("Cheese")
                .addMeat("Meat")
                .addMushroom("Mushroom")
                .addSeafood("Seafood")
                .addVegetable("Vegetable")
                .build();

    }
}


// мій неправильний варіант розв'язку цієї задача!!!)))

// class Pizza {
//     private String cheese;
//     private String meat;
//     private String seafood;
//     private String vegetable;
//     private String mushroom;


//     public Pizza(String cheese, String meat, String seafood, String vegetable, String mushroom) {
//         this.cheese = cheese;
//         this.meat = meat;
//         this.seafood = seafood;
//         this.vegetable = vegetable;
//         this.mushroom = mushroom;
//     }

//     private Pizza() { }

//     public static class PizzaBuilder{
        
//         private PizzaBuilder() {
//         }

//         public String addCheese(String cheese) {
//             return cheese;
//         }

//         public String addMeat(String meat) {
//             return meat;
//         }

//         public String addSeafood(String seafood) {
//             return seafood;
//         }

//         public String addVegetable(String vegetable) {
//             return vegetable;
//         }

//         public String addMushroom(String mushroom) {
//             return mushroom;
//         }

//         public Pizza build(){
//             return new Pizza();
//         }

//     }

//     public static PizzaBuilder base() {
//         return new PizzaBuilder();
//     }



// }

// class Oven {
//     public static Pizza cook() {


//         return new Pizza("sgad", "fsdsgf", "sdfgdf", "adfsd", "adfsd");

//     }
// }
