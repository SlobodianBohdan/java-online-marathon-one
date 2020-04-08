import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class MyUtils {
    // Code
    public List<String> strSort(List<String> originList) {
        // Code
        List<String> newList = new ArrayList<>();
        originList.forEach(i->{
            newList.add(i);
        });
        
        Collections.sort(newList, (o1, o2) -> {
            if(o1.length()<o2.length()){
                return -1;
            }if(o1.length()>o2.length()){
                return 1;
            }else{
                return o1.compareTo(o2);
            }
        });
        return newList;
    }
}
