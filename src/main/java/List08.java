import java.util.ArrayList;
import java.util.List;

public class List08 {
    public static void main(String[] args) {
        //Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        //Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(7);
        h.add(13);
        h.add(10);

        for (int i = 0; i < h.size(); i++) {
            if (h.get(i)==7 || h.get(i)==10){
                continue;
            }else{
                h.set(h.indexOf(h.get(i)),h.get(i)+2);
            }

        }
        System.out.println(h);
    }
}
