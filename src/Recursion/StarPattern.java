package Recursion;

public class StarPattern {
//printing the start in decreasing order
    public void printStar(int row, int col){
        if(row==0){return;}
          if(col<row) {
              System.out.print("*");
          printStar(row,col+1);
          }
          else {
              System.out.println();
              printStar(row-1,0);
          }

    }

    //prinitng stars in ascending order
    //the statements do come back from it was called in stack please made the  stack
    public void printStar2(int r, int c){
        if(r==0){return;}
        if(c<r) {
            printStar2(r,c+1);
            System.out.print("*");

        }
        else {
            printStar2(r-1,0);
            System.out.println();

        }

    }

    public static void main(String[] args) {
        StarPattern sp=new StarPattern();
        sp.printStar2(4,0
        );
    }



}
