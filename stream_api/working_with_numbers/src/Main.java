import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intList1 = new ArrayList<>();
        for (int res : intList) {
            if (res > 0 && res % 2 == 0){
                intList1.add(res);
            }
        }
        Collections.sort(intList1);
        System.out.println(intList1);
    }
}
