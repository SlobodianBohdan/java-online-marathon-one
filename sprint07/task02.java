// Suppose we have the next class:

// NameList class
// Create public inner class named Iterator inside NameList class that correspond the next class diagram:

// * For correct passing of all tests don't use print and println methods in your code.


class NameList {
    public class Iterator{
        private int counter;

        private Iterator(){

        }

        public boolean hasNext (){
            return counter < names.length? true : false;
        }

        public String next(){
            String value = names[counter];
            counter++;
            return value;
        }

    }
    private String[] names = {"Mike", "Emily", "Nick", "Patric", "Sara"};

    public Iterator getIterator() {
        return new Iterator();
    }
}
