import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    task1();
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 > 0) {
                System.out.println(num + " ");
            }
        }
        System.out.println();
    }
}