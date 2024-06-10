import java.util.*;

public class Tasks {
    public static void n1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void n2(List<Integer> nums) {
        for (Integer num : new TreeSet<>(nums)) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void n3(List<String> strings) {
        for (String str : new HashSet<>(strings)) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void n4(List<String> strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            result.merge(str, 1, Integer::sum);
        }
        System.out.println(result);
    }
}
