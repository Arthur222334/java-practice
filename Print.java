import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        System.out.println("what is your name :");
        Scanner de = new Scanner(System.in);
        String name = de.next();
        System.out.println("hello " + name +" how are you?");
    }
}
