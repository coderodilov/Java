package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//29.11.2022
//Coder Odilov
//Iterator & List

public class IteratorList {
    public static void main(String[] args) {

        String[] group = {"one", "two", "three", "four", "five"};
        List<String> mylist = new ArrayList<>();

        // adding strings to list 'mylist' from array 'group'
        Collections.addAll(mylist, group);

        for (String s : mylist) {
            System.out.printf("%s, ", s);
        }

        System.out.println();

        // using Iterator
        Iterator<String> iterator = mylist.iterator();
        System.out.printf("Current object is: %s next then %s \n", iterator.next(), (iterator.hasNext()) ? "has object" : "no object");
        System.out.printf("Current object is: %s next then %s \n", iterator.next(), (iterator.hasNext()) ? "has object" : "no object");
        System.out.printf("Current object is: %s next then %s \n", iterator.next(), (iterator.hasNext()) ? "has object" : "no object");
        System.out.printf("Current object is: %s next then %s \n", iterator.next(), (iterator.hasNext()) ? "has object" : "no object");
        System.out.printf("Current object is: %s next then %s \n", iterator.next(), (iterator.hasNext()) ? "has object" : "no object");
    }
}
