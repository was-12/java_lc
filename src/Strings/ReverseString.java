package Strings;

import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {
      char temp;
      int size=s.length-1;
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            s[i]=s[size-i];
            s[size-i]=temp;
        }
        System.out.println(Arrays.toString(s));

    }

    public static void main(String[] args) {
        char[] test="Testing".toCharArray();
        reverseString(test);


    }

}
