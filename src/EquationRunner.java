//Import Scanner Class for User Input
import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        //New Scanner Object
        Scanner s = new Scanner(System.in);

        //Ask for First Coordinate Point
        System.out.println("Enter the first coordinate point: ");
        System.out.print("x1: ");
        int x1 = s.nextInt();
        System.out.print("y1: ");
        int y1 = s.nextInt();

        //Ask for Second Coordinate Point
        System.out.println("Enter the second coordinate point: ");
        System.out.print("x2: ");
        int x2 = s.nextInt();
        System.out.print("y2: ");
        int y2 = s.nextInt();

        //New Instance of LinearEquation Class
        LinearEquation equation = new LinearEquation(x1,y1,x2,y2);

        //Print Equation and its Details
        System.out.println(equation);

        //Ask User for the X-Value of a Third Coordinate Point
        System.out.println("Enter a third x-value: ");
        double x3 = s.nextDouble();

        //Calculate the Y-Value of the Third Coordinate Point
        double y3 = equation.solveForY3(x3);

        //Display the Solved Coordinate Point
        System.out.println("The solved coordinate point is (" + x3 + "," + (String.format("%.2f",y3)) + ")");
    }
}











