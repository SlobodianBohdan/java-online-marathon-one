// Create class hierarchy that represent Address Book, where can be save records in format: "(first name, last name) => address":
// Records in the Addres Book should be represented as objects of the NameAddressPair type.
// The pair "(first name, last name)" is key for access to "address" in the Address Book.
// The key "(first name, last name)" should be immuteble and in Address Book cannot be two records with same key.
// The capacity of Address Book must grow twice when has no place for save the next record.
// The sortedBy(...) method should sorted records by ascending or descending using for this Arrays.sort(...) method.
// The Comparator should be implemented as an anonymous class.
// Sorting at first be by firstName field, and if the names match then by lastName field.
// The next() method from AddressBookIterator class should return record as String in next format: "First name: <first name>, Last name: <last name>, Address: <address>".
// Records in the Address Book must be ordered according to date of creation.
// A class hierarchy should be correspond the next class diagram:
// class_diagram
// The next graphic notation means, that B is inner class and A is outer class:
// outer_inner
// * If you see the next error: uses unchecked or unsafe operations, just put the next code line @SuppressWarnings("unchecked") over AddressBook and AddressBookIterator classes.
// * For correct passing of all tests don't use print and println methods in your code.

class AddressBook implements Iterable {
    private NameAddressPair[] addressBook;
    private int counter;

    public AddressBook(NameAddressPair[] addressBook, int counter) {
        this.addressBook = addressBook;
        this.counter = counter;
    }

    public AddressBook() {
        this.addressBook = new NameAddressPair[12];
    }

    public AddressBook(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity");
        }
        this.addressBook = new NameAddressPair[capacity];
    }

    public boolean create(String firstName, String lastName, String address) {
        NameAddressPair.Person person = new NameAddressPair.Person(firstName, lastName);
        if (size() != 0) {
            for (int i = 0; i < size(); i++) {
                if (addressBook[i].person.equals(person)) {
                    return false;
                }
            }

            if (counter == addressBook.length) {
                addressBook = Arrays.copyOf(addressBook, addressBook.length * 2);
            }
        }

        NameAddressPair pair = new NameAddressPair(new NameAddressPair.Person(firstName, lastName), address);
        addressBook[counter] = pair;
        counter++;

        return true;
    }

    public String read(String firstName, String lastName) {
        NameAddressPair.Person person = new NameAddressPair.Person(firstName, lastName);
        for (int i = 0; i < size(); i++) {
            if (addressBook[i].person.equals(person)) {
                return addressBook[i].address;
            }
        }
        return null;
    }

    public boolean update(String firstName, String lastName, String address) {
        NameAddressPair.Person person = new NameAddressPair.Person(firstName, lastName);
        for (int i = 0; i < size(); i++) {
            if (addressBook[i].person.equals(person)) {
                addressBook[i].address = address;
                return true;
            }
        }
        return false;
    }

    public boolean delete(String firstName, String lastName) {
        NameAddressPair.Person person = new NameAddressPair.Person(firstName, lastName);

        for (int i = 0; i < addressBook.length - 1; i++) {
            if (addressBook[i].person.equals(person)) {
                if (i == size() - 1) {
                    addressBook[i] = null;
                } else {
                    for (int j = i; j < addressBook.length - 1; j++) {
                        int a = j + 1;
                        addressBook[j] = addressBook[a];
                    }
                    addressBook[size() - 1] = null;
                }
                counter--;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return counter;
    }

    public void sortedBy(SortOrder order) {
        Arrays.sort(addressBook, (o1, o2) -> {
            if (o1 == null || o2 == null) {
                return 0;
            }
            if (order == SortOrder.ASC) {
                int result = o1.person.firstName.compareTo(o2.person.firstName);
                return  (result != 0) ? result : o1.person.lastName.compareTo(o2.person.lastName);
            } else {
                int result = o2.person.firstName.compareTo(o1.person.firstName);
                return  (result != 0) ? result : o2.person.lastName.compareTo(o1.person.lastName);
            }

        });
    }


    @Override
    public Iterator iterator() {
        return new AddressBookIterator();
    }


    private class AddressBookIterator implements Iterator {
        private int counter;

        @Override
        public boolean hasNext() {
            return counter < addressBook.length && addressBook[counter] != null ? true : false;
        }

        @Override
        public String next() {
            NameAddressPair record = addressBook[counter++];
            return "First name: " + record.person.firstName + ", Last name: " + record.person.lastName + ", Address: " + record.address;
        }
    }


    private static class NameAddressPair {
        private final Person person;
        private String address;


        private NameAddressPair(Person person, String address) {
            this.person = person;
            this.address = address;
        }

        public Person getPerson() {
            return person;
        }

        public String getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "NameAddressPair{" +
                    "First Name:<" + person.firstName + ">" +
                    ",Last Name:<" + person.lastName + ">" +
                    ",Address:<" + address + ">" +
                    '}';
        }

        private static class Person {
            private String firstName;
            private String lastName;


            private Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Person)) return false;
                Person person = (Person) o;
                if (person.firstName == null || person.lastName == null) return false;
                return firstName.equals(person.firstName) &&
                        lastName.equals(person.lastName);
            }

            @Override
            public int hashCode() {
                return 13 * firstName.length() * lastName.length();
            }
        }
    }

}

enum SortOrder {
    ASC, DESC;
}
