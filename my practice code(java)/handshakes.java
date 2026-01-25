import java.util.*;
public class handshakes{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int nos=sc.nextInt();
int combi=(nos*(nos-1));
int max= combi/2;
System.out.print("maximum no of handshakes"+max);
}
}
