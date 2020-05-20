import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //1
        ArrayList<String> strings1 = new ArrayList<String>();

        //Maak lijst van 50 1 letter strings
        Random r = new Random();
        for(int i = 0; i < 25; i++){
            strings1.add(String.valueOf((char)(r.nextInt(26) + 'a')));
        }
        System.out.println(strings1);

        //Bubble sort list
        int len = strings1.size();
        boolean done;
        do {
            done = true;
            for(int i = 1; i < len; i++){
                //-96 omdat het alleen kleine letters zijn
                char string2CharA = strings1.get(i-1).charAt(0);
                char string2CharB = strings1.get(i).charAt(0);
                int charIndexA = (int)string2CharA-96;
                int charIndexB = (int)string2CharB-96;
                if(charIndexA > charIndexB){
                    Collections.swap(strings1, i-1, i);
                    done = false;
                }
            }
        }
        while (done == false);
        System.out.println(strings1);

        //2
        Stack<String> strings2 = new Stack<String>();
        for(int i = 0; i < 25; i++){
            strings2.add(String.valueOf((char)(r.nextInt(26) + 'a')));
        }
        System.out.println(strings2);

        //Bubble sort
        int stackSize = strings2.size();
        boolean stackDone;
        do {
            stackDone = true;
            for(int i = 1; i < stackSize; i++){
                //-96 omdat het alleen kleine letters zijn
                char string2CharA = strings2.get(i-1).charAt(0);
                char string2CharB = strings2.get(i).charAt(0);
                int charIndexA = (int)string2CharA-96;
                int charIndexB = (int)string2CharB-96;
                if(charIndexA > charIndexB){
                    Collections.swap(strings2, i-1, i);
                    stackDone = false;
                }
            }
        }
        while (stackDone == false);
        System.out.println(strings2);


    }
}
