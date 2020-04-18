// Create next types: Person (field String name), Student (fields String studyPlace, int studyYears) and Worker (fields String workPosition, int experienceYears). Classes Student and Worker are derived from class Person. All classes have getters to return fields.
// Create a maxDuration() method of the MyUtils class to return a list of Students with maximum duration of study and Workers with maximum experience.
// For example, for a given list
// [Person [name=Ivan], Student [name=Petro, studyPlace=University, studyYears=3], Worker [name=Andriy, workPosition=Developer, experienceYears=12], Student [name=Stepan, studyPlace=College, studyYears=4], Worker [name=Ira, workPosition=Manager, experienceYears=8], Student [name=Ihor, studyPlace=University, studyYears=4]]
// you should get
// [Worker [name=Andriy, workPosition=Developer, experienceYears=12], Student [name=Stepan, studyPlace=College, studyYears=4], Student [name=Ihor, studyPlace=University, studyYears=4]]

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person {
    // Code
    private String name;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        if (name == null) return false;
        Person person = (Person) o;
        return getName().equals(person.getName());
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class Student extends Person {
    // Code
    private String studyPlace;
    private int studyYears;

    public Student() {

    }

    public Student(String name, String studyPlace, int studyYears) {
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;
    }

    public String getStudyPlace() {
        return studyPlace;
    }

    public int getStudyYears() {
        return studyYears;
    }

    @Override
    public String toString() {
        return "Student{" + "'" + getName() + '\'' +
                ", studyPlace='" + studyPlace + '\'' +
                ", studyYears=" + studyYears +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        if (studyYears == 0) return false;
        if (studyPlace == null) return false;
        Student student = (Student) o;
        return getName().equals(student.getName()) &&
                getStudyYears() == student.getStudyYears() &&
                getStudyPlace().equals(student.getStudyPlace());
    }

    @Override
    public int hashCode() {
        return ((getName().length()+getStudyYears()+getStudyPlace().length()))*31;
    }
}

class Worker extends Person {
    // Code
    private String workPosition;
    private int experienceYears;

    public Worker() {

    }

    public Worker(String name, String workPosition, int experienceYears) {
        super(name);
        this.workPosition = workPosition;
        this.experienceYears = experienceYears;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name=" + "'" + getName() + '\'' +
                ", workPosition='" + workPosition + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        if (!super.equals(o)) return false;
        if (experienceYears == 0) return false;
        if (workPosition == null) return false;
        Worker worker = (Worker) o;
        return getName().equals(worker.getName()) &&
                getExperienceYears() == worker.getExperienceYears() &&
                getWorkPosition().equals(worker.getWorkPosition());
    }

    @Override
    public int hashCode() {
        return (getName().length()+getExperienceYears()+ getWorkPosition().length())*31;
    }
}
class MyUtils {
    public List<Person> maxDuration(List<Person> persons) {
        List<Person> list = new ArrayList<>();
        Person worker = new Worker();
        Person student = new Student();
        if (persons.isEmpty() || persons.get(0) == null){
            return list;
        }

        for (Person p : persons) {
            if (p instanceof Student) {
                if (((Student) p).getStudyYears() > ((Student)student).getStudyYears() && !student.equals(p)) {
                    student = (Student) p;
                }
            }
            if (p instanceof Worker){
                if (((Worker) p).getExperienceYears() > ((Worker)worker).getExperienceYears() && !worker.equals(p)) {
                    worker = (Worker) p;
                }
            }
        }
        if (student.getName() == null || worker.getName() == null){
            return list;
        }
        list.add(student);
        list.add(worker);

        for (Person p : persons) {
            if (p instanceof Student) {
                if (((Student) p).getStudyYears() == ((Student)student).getStudyYears() && !student.equals(p)) {
                    list.add(p);
                }
            }
            if (p instanceof Worker) {
                if (((Worker) p).getExperienceYears() == ((Worker)worker).getExperienceYears() && !worker.equals(p)) {
                    list.add(p);
                }
            }
        }
        return list;
    }
}
