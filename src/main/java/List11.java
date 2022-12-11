import java.util.ArrayList;
import java.util.List;

public class List11 {
    public static void main(String[] args) {
        //Check if all elements are unique in an integer List by using loops
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);
        int idxL = 0;
        int idtF = 0;
        for (int i = 0; i < myList.size(); i++) {
            idxL = myList.lastIndexOf(myList.get(i));
            idtF = myList.indexOf(myList.get(i));



        }if (idxL!=idtF){
            System.out.println("benzersiz");
        }else System.out.println("degil");

    }
}