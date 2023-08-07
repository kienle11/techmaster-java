import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Class_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
       List<Integer> integers = new ArrayList<>(Arrays.asList(1,4,5,2));
        strings.add("Kien");
        strings.get(0);
        System.out.println(strings.get(0));
        System.out.println(integers);
        integers.set(2,10);
        List<Integer> intChild = new ArrayList<>(Arrays.asList(20,30));
        integers.addAll(intChild);
        Collections.sort(integers);
        System.out.println(integers);
    }
}
