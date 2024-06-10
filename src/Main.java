import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(6, 1, 2, 3, 4, 4, 5, 7, 8, 6, 9, -10);
        Tasks.n1(nums);
        Tasks.n2(nums);
        List<String> strings = List.of("kjkds", "djfh", "sd", "kjkds");
        Tasks.n3(strings);
        Tasks.n4(strings);
    }
}