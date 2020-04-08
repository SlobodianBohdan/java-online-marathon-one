import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class MyUtils {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            if (getId() == student.getId() && getName() == null) return true;
            return getId() == student.getId() &&
                    getName().equals(student.getName());
        }

        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + id;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }
    }

    public Set<Student> commonStudents(List<Student> list1, List<Student> list2) {
        Set<Student> set = new HashSet<Student>();

        new HashSet<Student>(list2).forEach(i -> {
            if (list1.contains(i)){
                set.add(i);
            }
        });
        return set;
    }
}
