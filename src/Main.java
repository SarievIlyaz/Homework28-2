import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 23, 6, 0, 12, 123, 6, 5, 1, 99, 3, 4, 1, 2);
        System.out.println("Бардык сандар" +list);
        System.out.println("Сандардын суммасы : " + list.stream().mapToInt(x -> x).sum());
        System.out.println("Арифметикалык орточо сан : "+list.stream().mapToInt(x -> x).sum() / list.size());
        Set<Integer> newList = new LinkedHashSet<>();
        System.out.println("Дубликат сандар : "+ list.stream().filter(x -> !newList.add(x)).toList());
        System.out.println(newList);
    }
}