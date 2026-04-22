package StreamApI;
import java.util.List;
public class Practice2{
    static void main(String[] args) {
        List<Integer> list= List.of(1,5,7,6,778,87,789,45,34,16);
        System.out.println("this is our list"+list);
        list.stream().sorted().toList().forEach(System.out::println);
        System.out.println("this is our sorted list");
        System.out.println("Remove Duplicate Elements");
        list.stream().distinct().toList().forEach(System.out::println);
        System.out.println("Even numbers in a list ");
        list.stream().filter(x->x%2==0).toList().forEach(System.out::println);
        System.out.println("this is the odd nos present in list");
        list.stream().filter(x->x%2!=0).toList().forEach(System.out::println);
        System.out.println("This is the Square of even nos");
        list.stream().filter(x->x%2==0).map(x->x*x).toList().forEach(System.out::println);
    }
}
