package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//29.11.2022
//Coder Odilov
//List & Collections & Contains

public class List1 {
    public static void main(String[] args) {
        String[] group = {"one", "two", "three", "four", "five"};
        List<String> mylist = new ArrayList<>();

        // adding strings to list 'mylist' from array 'group'
        Collections.addAll(mylist, group);

        for (String s : mylist) {
            System.out.printf("%s, ", s);
        }
        System.out.println();

        // if object has in the collection result = true:
        System.out.println(mylist.contains(mylist.get(2)));

        // if object has not in the collection result = false:
        System.out.println(mylist.contains("six"));

    }
}
