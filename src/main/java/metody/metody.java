package metody;

import java.util.Comparator;
import java.util.List;

public class metody {

    public static int findMaxNumber(List<Integer> numbers){
        numbers.stream().max(Comparator.comparing(Integer::intValue));
        return 0;
    }
    public static void writeToConsoleThatMilkyJePica(){
        System.out.println("Milky je pica");
    }
    public static String metodaKtoraVraciaEmptyString(){
        return "";
    }
}
