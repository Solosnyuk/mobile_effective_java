package colection;

import java.util.HashMap;

public class TaskOne {
   public static void wordCount(String text){
       String[] words = text
               .toLowerCase()
               .replaceAll("[^a-zа-яё0-9\\s]", "")
               .split(" ");

       HashMap<String, Integer> textWord = new HashMap<>();

       for(String word : words) {
           textWord.merge(word, 1, (word1, word2) -> word1 + word2);
       }

       System.out.println(textWord);
   }
}
