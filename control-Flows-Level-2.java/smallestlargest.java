import java.util.*;
public class smallestlargest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int H1=sc.nextInt();
int H2=sc.nextInt();
int H3=sc.nextInt();
if((H1>H2)&&(H1>H3)){
System.out.println("H1 is greatest");
}
else if((H2>H1)&&(H2>H3)){
System.out.println("H2 is greatest");
}
else{
System.out.println("H3 is greatest");
}
if((H2>H1)&&(H3>H1)){
System.out.println("H1 is smallest");
}
else if((H1>H2)&&(H3>H2)){
System.out.println("H2 is smallest");
}
else{
System.out.println("H3 is smallest");
}
}
}
