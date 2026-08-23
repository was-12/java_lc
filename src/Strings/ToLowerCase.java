package Strings;

import java.util.Locale;

public class ToLowerCase {

    public String toLowerCase(String s) {

char [] charString=s.toCharArray();

for(int i=0;i<charString.length;i++){
    if(charString[i]>='A' &&  charString[i]<='Z'){

        charString[i]=(char)(charString[i]+32);
    }
}

//        char [] charString= s.toCharArray();
//        return s.toLowerCase();
          return new String(charString);
    }

    public static void main(String[] args) {
        String test="ABCD";
        ToLowerCase t=new ToLowerCase();
        String ans=t.toLowerCase(test);
        System.out.println(ans.toString());
    }


}
