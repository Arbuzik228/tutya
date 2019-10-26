/**
 * Created by Admin on 26.10.2019.
 */
public class HopHeyTralaley {
    public static void main(String[] args) {
        int god = 1234567890;
        int tool = 1234567890;
        if (god < tool) System.out.println("god==tool");
        else System.out.println("god !=ln tool");

       String gobtool= (god < tool) ? "god==tool" : "god !=ln tool";
       System.out.println(gobtool);
       String red ="yellow";
       if (red.equals("yellow")) System.out.println("stay");
       else if (red.equals("red")) System.out.println("stay");
       else System.out.println("go");

    }
}
