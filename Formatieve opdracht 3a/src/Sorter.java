import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Sorter<E> {
    List<E> bubbleSorter(List<E> object){
        int len = object.size();
        boolean done;
        do {
            done = true;
            for(int i = 1; i < len; i++){
                //-96 omdat het alleen kleine letters zijn
                StringBuilder stringBuilderA = new StringBuilder((String)object.get(i-1));
                StringBuilder stringBuilderB = new StringBuilder((String)object.get(i));
                char string2CharA = stringBuilderA.charAt(0);
                char string2CharB = stringBuilderB.charAt(0);
                int charIndexA = (int)string2CharA-96;
                int charIndexB = (int)string2CharB-96;
                if(charIndexA > charIndexB){
                    Collections.swap(object, i-1, i);
                    done = false;
                }
            }
        }
        while (!done);
        return object;
    }

}
