package Strings;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
   List<Integer> result = new ArrayList<>();
        int size=words.length;


        for(int i=0;i<size;i++){
       char[] curentCharArray= words[i].toCharArray();
            for(int j=0;j<curentCharArray.length;j++){
               if(x==curentCharArray[j]){
                   result.add(i);
               }
            }
        }
return result;
    }

    public static void main(String[] args) {
        WordsContainingCharacter wordsContainingCharacter = new WordsContainingCharacter();
     String []   words = {"leet","code"};
       List<Integer>ans= wordsContainingCharacter.findWordsContaining(words,'t');
        System.out.println(ans.toArray());

    }
}
