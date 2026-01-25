import java.util.*;
public class springseason{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter month in no");
int month=sc.nextInt();
System.out.println("enter day in no");
int day=sc.nextInt();
if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {
	System.out.println("Its  a spring season");
}
}
}
