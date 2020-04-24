// Suppose, we have class Person:

// // class Person{    
// //   String name;     
// //   String surname;      
// // Person(String name, String surname){         
// //   this.name = name;         
// //   this.surname = surname;     
// //   } 
// // }

// Please, add to class App static BinaryOperator field greetingOperator. 
// greetingOperator should work with strings. It forms a new string as a result by the rule: "Hello " + parameter1 + " " + parameter2 + "!!!"
// Create a static method createGreetings that takes two parameters: List<Person> and BinaryOperator and generates List<String> as a result. We should be able to pass greetingOperator as a parameter here. Please, use the second parameter in creating the result.


import java.util.function.BinaryOperator;
import java.util.ArrayList;
import java.util.List;
class App {
    static  BinaryOperator<String>  greetingOperator = new BinaryOperator<String>() {
        @Override
        public String apply(String s1, String s2) {
            return "Hello " + s1 + " " + s2 + "!!!";
        }
    };



    public static List<String> createGreetings(List<Person> people, BinaryOperator<String> binaryOperator){
        List<String> list = new ArrayList<>();
        people.forEach(i->{
            list.add( binaryOperator.apply(i.name, i.surname));
        });

        return list;
    }
}
