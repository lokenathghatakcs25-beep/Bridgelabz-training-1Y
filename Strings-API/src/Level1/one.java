package Level1;
import java.util.*;
public class assing1 {
        public static boolean compare(String s1,String s2){
            if(s1.length()!=s2.length()){
                return false;
            }
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String gtr=sc.nextLine();
            boolean result=compare(str,gtr);
            boolean equal=str.equals(gtr);
            if(equal==result){
                System.out.println("results are same");
            }
            else{
                System.out.println("Results are different");
            }
        }
    }
}
