package Strings;
public class Anagram {
    public boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] scoreboard = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            scoreboard[word1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word2.length(); i++) {
            scoreboard[word2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (scoreboard[i] != 0) {
                return false;
            }
        }

        return true;
    }
}