import Strings.NeedleInHaystack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        NeedleInHaystack nh= new NeedleInHaystack();
        int ans=nh.strStr("haystack", "sta");
        System.out.println(ans);
    }
}