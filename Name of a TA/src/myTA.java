import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class myTA {
    public static void main(String[] args) {
        String taName, studentName;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is The Name of the TA?");
        taName = sc.nextLine();
        System.out.println("What is The Name of the Student?");
        studentName = sc.nextLine();
        System.out.print("Dear " + taName  + ",\nI enjoy your tutorials, they are awesome!\n" +studentName);
    }
}