package Recursion;

public class PrintNumber {
//print upto 1
    public static void printNumberUptoOne(int n) {
        if (n==1){
            System.out.println(1);
         return ;
        }
        System.out.println(n);

        printNumberUptoOne(n-1);

    }
//reverse fo printing
    public static void printNumberUntilNumber(int n) {
   if(n==0){
      return ;
   }
        printNumberUntilNumber(n-1);

        System.out.println(n);

    }
    //we are showing like 5 4 3 2 1 1 2 3 4 5
    //first of all that we are printign so cal recursive call goes for 5 then 4 and so on but they are not completed
    //as the last print statement in remaining okay so when comleted(like return from 0), it start coming out
    // from top like then last call is of 1 so first 1 will pop out
 public static void combinedPrintNumber(int n){
        if(n==0){
            return;
        }
     System.out.println(n);
        combinedPrintNumber(n-1);
     System.out.println(n);


 }
    public static void main(String[] args) {
        PrintNumber p=new PrintNumber();
        //printNumberUptoOne(5);
        //printNumberUntilNumber(5);
        combinedPrintNumber(6);
        //System.out.println();
    }

}
