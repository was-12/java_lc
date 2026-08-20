//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

      String test="aabsdf";
      //    FirstNonRepeatingCharacter firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();
       // int ans=firstNonRepeatingCharacter.firstUniqChar(test);
       LongestUniqueSubstring longestUniqueSubstring = new LongestUniqueSubstring();
       int ans=longestUniqueSubstring.lengthOfLongestSubstring(test);
       System.out.println(ans);
    }
}