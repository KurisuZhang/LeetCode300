import java.util.*;
import java.util.stream.Collectors;

public class hhhh {


    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('c');
        list.add('a');

        StringBuilder stringBuilder = new StringBuilder();

        for (Character c :
                list) {
            stringBuilder.append(c);
        }

        System.out.println(stringBuilder.toString());

    }



}
