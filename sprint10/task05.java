//        Suppose we have the next class hierarchy:
//        Create classes with name PersonComparator, EmployeeComparator, DeveloperComparator that implenent the Comparator<Type> generic interface.
//        In the Utility class create public static method named sortPeople(...) that takes an array of Person type and derivative from it types, and comparator as input, and returns the value of void type.
//        Also, as second argument the method sortPeople(...) can takes generic comparator for elements of Object type.
//        The sortPeople(...) method should sorted records by ascending. At first by name, then by age, then by salary, and then by Level (JUNIOR < MIDDLE < SENIOR)
//        As implementation of sortPeople(...) method use the next code:
//        * For correct passing of all tests don't use print and println methods in your code.

class PersonComparator implements Comparator<Object> {
    Comparator<Person> comparator =  Comparator.comparing(Person::getName)
                                     .thenComparing(Person::getAge);

    @Override
    public int compare(Object o1, Object o2) {
        return comparator.compare((Person) o1,(Person) o2);
    }

}

class EmployeeComparator implements Comparator<Object>{
    Comparator<Employee> comparator =
            Comparator.comparing(Employee::getName)
                    .thenComparing(Employee::getAge)
                    .thenComparing(Employee::getSalary);

    @Override
    public int compare(Object o1, Object o2) {
        return comparator.compare((Employee) o1,(Employee) o2);
    }
}

class DeveloperComparator implements Comparator<Object>{
    Comparator<Developer> comparator =
            Comparator.comparing(Developer::getName)
            .thenComparing(Developer::getAge)
            .thenComparing(Developer::getSalary)
            .thenComparing(Developer::getLevel);

    @Override
    public int compare(Object o1, Object o2) {
       return comparator.compare((Developer) o1,(Developer) o2);
    }
}

class Utility {

    public static <T extends Person> void sortPeople(T[] array, Comparator<Object> comparator){
        Arrays.sort(array, comparator);
    }

}
