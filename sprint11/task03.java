// Suppose, we class Plant from the task2, which includes private fields String name, Color color and Type type, and constructor with three String parameters where these fields are initialized. Color and Type are Enum. 
// Color contains White, Red, Blue entries.
// Type contains Rare and Ordinary entries.
// And we have classes ColorException and TypeException as derived from Exception.
// The constructor of Plant throws a corresponding exception whenever an inappropriate parameter is passed.
// (public Plant(String type, String color, String name) throws ColorException, TypeException)
// Write a static tryCreatePlant method that takes 3 string parameters - type, color and name and returns an instance of Plant, created based on passed params. (Don't create any classes, write as if you are already inside a class.)
// The tryCreatePlant method should catch exceptions that can be thrown by Plant constructor. If inappropriate type passed as a parameter, a Plant object should be returned anyway, with Ordinary type. If an inappropriate color is passed, set Red color for created instance.


    public static Plant tryCreatePlant(String type, String color, String name) throws ColorException, TypeException{
        try {
            new Plant("Ordinary", color, name);
        }catch (ColorException c) {
            color = "Red";
        }
        try {
            new Plant(type, color, name);
        }catch (TypeException t){
            type = "Ordinary";
        }
        return new Plant(type, color, name);
    }
