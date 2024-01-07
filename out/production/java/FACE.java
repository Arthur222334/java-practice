import java.util.Scanner;

public class FACE {

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);


          System.out.println("enter your 1st subject marks");
          float ft=sc.nextFloat();
          System.out.println("enter your 2nd subject marks");
          float sd = sc.nextFloat();
          System.out.println("enter your 3rd subject marks");
          float td = sc.nextFloat();
          System.out.println("enter your 4th subject marks");
          float fh= sc.nextFloat();
          System.out.println("enter your 5th subject marks");
          float fth =sc.nextFloat();
           float sum =ft+sd+td+fh+fth;
           float average= sum/5 ;
           float percentage = (sum/500)*100;
          System.out.println("Percentage: " + percentage + "%");
          sc.close();



          //System.out.println("enter number 1:");

          //int a = sc.nextInt();
          //System.out.println(sc.hasNextInt());
          //sc.notifyAll();
         // System.out.println("enter number2 : ");
          //int B = sc.nextInt();
          //int sum=a+B;
         // boolean b2 = sc.hasNextLong();
          //System.out.println(b2);
         // String str = sc.nextLine();
          //System.out.println(str);
      }

      }
