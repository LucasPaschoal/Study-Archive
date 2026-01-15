import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Josh");
        list.add("Maria");
        list.add("Joseph");
        list.add("Kay");

        list.add(3, "Mario");

        for (String x: list){
            System.out.println(x);
        }
        System.out.println("---------------------------------");

        list.remove("Kay");
        list.removeIf(y -> y.charAt(0) == 'J');

        for (String x: list){
            System.out.println(x);
        }
        System.out.println("---------------------------------");
        System.out.println("Index of Mario: "+ list.indexOf("Mario"));

        System.out.println("---------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').toList();
        for (String x: result){
            System.out.println(x);
        }

        System.out.println("---------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);
    }
}