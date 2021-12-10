package tfip.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        String[] words = new String[]{"this", "is","a","cat"};
        List<String> listOfWords = new ArrayList<>(Arrays.asList(words));
        List<String> evenLengthWords = new LinkedList<>();
        
        for (String w: listOfWords)
            if(0 ==(w.length() & 1)){
                evenLengthWords.add(w.toUpperCase());
                System.out.println(evenLengthWords);}
            }

            String[] words2 = new String[]{
                "this", "is","a","cat"
            };
            List<String> listOfWords2 = new ArrayList<>(Arrays.asList(words2));
            .filter(w->0 == (w.length()&1));
            .map(String::toUpperCase);
            .collect()(Collectors.toList());

            system.out.println("Even Length Using Stream" + evenLengthWords2);

    } 
}