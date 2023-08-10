import java.util.ArrayList;
import java.util.List;


/*
what is the difference of String[] and List<String>?
String[] (Array of Strings)
List<String> (List of Strings)
*/

public class ListAndArray {

    // method of creating a list
    public static List<String> createList(){
        List<String> namesList = new ArrayList<>();
        // adding elements to the list
        namesList.add("Alice");
        namesList.add("Google");
        namesList.add("Pet");
        namesList.add("Jerry");
        namesList.remove(0);
        return namesList;
    }

    // method of creating an array
    // this is not a format way to use!!!
    // Don't use this method!!! =>String[]
    public static String[] createArray() {
        String[] namesArray = {"Alice","Google","Pet","Jerry"};
        return namesArray;
    }

    public static ArrayList<String> createArrayList(){
        // Create an ArrayList to store strings
        ArrayList<String> arrayList = new ArrayList<>();
        // Adding elements to the list
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Java");
        String firstElement = arrayList.get(0);
        // set new element into index 2
        arrayList.set(2, "copyOf"+firstElement);
        // remove 'Hello'
        arrayList.remove(0);
        // add new element 'Happy'
        arrayList.add(2, "Happy");
        arrayList.add(3, "Happy1");  // the index only can be prioritized
        return arrayList;
    }

    public static void main(String[] args) {
        // testing list
        System.out.println(createList());
        System.out.println(createList().get(1));    // method get()

        System.out.println();

        // testing array
        String[] array = createArray();
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println();
        // testing arrayList
        System.out.println(createArrayList());
    }
}
