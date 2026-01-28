import java.util.*;
public class bmi{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter weight in kgs ");
double weight=sc.nextDouble();
System.out.println("enter height in cms");
double height=sc.nextDouble();
double heightm=height/100;
double bmi=weight/(heightm*heightm);
if(bmi<=18.4){
System.out.println("underweight");
}
else if(bmi>=18.5&&bmi<=24.9){
System.out.println("normal");
}
else if(bmi>=25.0&&bmi<=39.9){
System.out.println("overweight");
}
else{
System.out.println("obese");
}
}
}

