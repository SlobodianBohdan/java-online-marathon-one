// Let the key of Map is project name and value contains list of participants.
// Create a Stream<String> nameList(Map<String, Stream<String>> map) method of the MyUtils class to build sorted stream of all participants without duplication.
// Please ignore null or empty strings, extra spaces and case sensitivity.
// Throw NullPointerException if map is null.
// For example, for a given map
// {"Desktop"=[" iVan", "PeTro ", " Ira "], "Web"=["STepan", "ira ", " Andriy ", "an na"], "Spring"=["Ivan", "Anna"]}
// you should get
// ["Andriy", "Anna", "Ira", "Ivan", "Petro ", "Stepan"]

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Objects.isNull;

class MyUtils {
    public Stream<String> nameList(Map<String, Stream<String>> map) {
        if(isNull(map)) throw  new NullPointerException();
        return map.values().stream()
                .filter(s->!isNull(s))
                .flatMap(s->s)
                .filter(s -> !isNull(s) && !s.isBlank())
                .map(s -> s.toLowerCase())
                .map(s -> s.replace(" ", ""))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .distinct()
                .sorted();
    }
}
