// Write a method to read from a file a character-oriented data and return these data as String object.
// For example, next fragment:
// after reading will be transform to the next String object:
// "This is text fragment\nthat contains some text data\nand can be read!"
// * For correct passing of all tests don't use print and println methods in your code.


public static String readFile(String filename) {
        String content = "";
        File file = new File(filename);
        try (FileReader reader = new FileReader(file)){
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
}
