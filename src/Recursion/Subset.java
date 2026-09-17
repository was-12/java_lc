package Recursion;

public class Subset {


static void printSubset(String p, String up){


    if(up.isEmpty()==true)
    {
        System.out.println(p);
return;
    }
    char currentChar=up.charAt(0);
    //we need to add one when one character is ignored and other time it is picked up
    printSubset(p+currentChar,up.substring(1));
    printSubset(p,up.substring(1));
}

    public static void main(String[] args) {
        printSubset("","abc");
    }

}
