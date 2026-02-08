package com.gla.Array;
import java.util.*;
public class practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stud = sc.nextInt();
        double[][] res = new double[stud][4];
        for (int i = 0; i < stud; i++) {
            res[i][0] = sc.nextInt();// for physics as we will target the columns which is  directly proportional to the students
            res[i][1] = sc.nextInt();
            res[i][2] = sc.nextInt();
        }
        for (int i = 0; i < stud; i++) {
            res[i][3] = (res[i][0] + res[i][1] + res[i][2]) * 100 / 300;
            if (res[i][3] >= 80) {
                System.out.println("above agency normalised");
            } else if (res[i][3] >= 70 && res[i][3] <= 79) {
                System.out.println("at agency normalised");
            } else if (res[i][3] >= 60 && res[i][3] <= 69) {
                System.out.println(" below but aproaching agency normalised students ");
            } else if (res[i][3] >= 50 && res[i][3] <= 59) {
                System.out.println("well below normalised students");
            } else if (res[i][3] >= 40 && res[i][3] <= 49) {
                System.out.println("too below normalised");
            } else {
                System.out.println("Remedial standards");
            }
        }
        for (int i = 0; i < stud; i++) {
           for(int j=0;j<4;j++){
               System.out.print(res[i][j]);
           }
           System.out.println();
        }
    }
}
