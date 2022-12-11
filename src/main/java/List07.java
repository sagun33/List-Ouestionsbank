import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List07 {
    public static void main(String[] args) {
       // Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
       // Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        Collections.sort(h);
        int minDiff = h.get(2) - h.get(1);
        for(int i=1; i<h.size(); i++){
            minDiff = Math.min(minDiff, h.get(i)-h.get(i-1));
            if(h.get(i)-h.get(i-1) == minDiff){
                System.out.println(h.get(i) + " and " + h.get(i-1));
        }

        }
    }
}
