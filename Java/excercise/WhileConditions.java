

public class WhileConditions {

    static String[] nameList = {"Pet","July","Coco","Marry","Leo"};  // make a name list

    public static void main(String[] args) {
        int index = 0;
        while(index < nameList.length){
            String name = nameList[index];
            System.out.println(name);
            index++;
        }
    }
}
