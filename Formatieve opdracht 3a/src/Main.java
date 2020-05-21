import java.util.*;

public class Main {
    public static void main(String[] args) {

        Sorter sorter = new Sorter();

        //1
        ArrayList<String> strings1 = new ArrayList<String>();

        //Maak lijst van 50 1 letter strings
        Random r = new Random();
        for(int i = 0; i < 25; i++){
            strings1.add(String.valueOf((char)(r.nextInt(26) + 'a')));
        }
        System.out.println(strings1);

        //Bubble sort list
        System.out.println(sorter.bubbleSorter(strings1));

        //2
        Stack<String> strings2 = new Stack<String>();
        for(int i = 0; i < 25; i++){
            strings2.add(String.valueOf((char)(r.nextInt(26) + 'a')));
        }
        System.out.println(strings2);

        //Bubble sort
        System.out.println(sorter.bubbleSorter(strings2));

        //3
        PriorityQueue<String> strings3 = new PriorityQueue<String>();
        for(int i = 0; i < 25; i++){
            strings3.add(String.valueOf((char)(r.nextInt(26) + 'a')));
        }
        System.out.println(strings3);

        //Selection sort
        int queueSize = strings3.size();
        PriorityQueue<String> sortedStrings3 = new PriorityQueue<String>();
        while(sortedStrings3.size() != queueSize){
            sortedStrings3.add(strings3.poll());
        }
        System.out.println(sortedStrings3);

        //4
        PriorityQueue<AutoRit> autoRitten = new PriorityQueue<AutoRit>();
        for(int i = 0; i < 25; i++){
            AutoRit temp = new AutoRit(r.nextInt(100), r.nextInt(100));
            autoRitten.add(temp);
        }

        //Printing autoRitten
        String autoRittenString = "[";
        for (AutoRit i : autoRitten){
            autoRittenString += i.afstand + i.benzineKosten + ", ";
        }
        autoRittenString += "]";
        System.out.println(autoRittenString);

        //Selection sort autoRitten
        int autoRittenSize = autoRitten.size();
        PriorityQueue<AutoRit> sortedAutoRitten = new PriorityQueue<AutoRit>();
        while(sortedAutoRitten.size() != autoRittenSize){
            sortedAutoRitten.add(autoRitten.poll());
        }

        //Printing sorted autoRitten
        String sortedAutoRittenString = "[";
        for (AutoRit i : sortedAutoRitten){
            sortedAutoRittenString += i.afstand + i.benzineKosten + ", ";
        }
        sortedAutoRittenString += "]";
        System.out.println(sortedAutoRittenString);
    }
}
