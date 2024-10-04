import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first coordinate point: ");
        System.out.print("x1: ");
        int x1 = s.nextInt();
        System.out.print("y1: ");
        int y1 = s.nextInt();
        System.out.println("Enter the second coordinate point: ");
        System.out.print("x2: ");
        int x2 = s.nextInt();
        System.out.print("y2: ");
        int y2 = s.nextInt();
        LinearEquation equation = new LinearEquation(x1,y1,x2,y2);
        System.out.println(equation);
    }
}






