import java.util.*;
public class grade{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int marks =sc.nextInt();
if((marks>=90)&&(marks<100)){
System.out.println("Grade A");
}
else if((marks>=80)&&(marks<90)){
System.out.println("Grade B");
}
else{
System.out.println("Grade C");
}
}
}
 