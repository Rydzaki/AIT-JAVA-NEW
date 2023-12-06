package practice.map;

import javax.swing.*;
import java.util.*;

public class WordFreqApl {
    public static void main(String[] args) {
        String [] words = {"abc", "ab", "Limit", "ab", "a", "ab", "Limit"};
        printWordsFrequency(words);
    }

    public static void printWordsFrequency(String[] words){
        Map<String, Integer> resMap = new HashMap<>();

        for (String word : words) {
            if(!resMap.containsKey(word)){ // такое слово не встречалось
                resMap.put(word, 1);// то пишем в мапу слово и 1
            }else {
                resMap.put(word, resMap.get(word)+1);
            }

        }
        Set<Map.Entry<String, Integer>> entries = resMap.entrySet();
        System.out.println("======unsorted========");
        for (Map.Entry<String, Integer> entry : entries ) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
        System.out.println("========Sorted by value===========");
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);
        list.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));
        list.forEach(e -> System.out.println(e));
    }

}
