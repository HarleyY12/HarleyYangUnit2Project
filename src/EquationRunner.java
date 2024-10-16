//Import Scanner Class for User Input
import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        //New Scanner Object
        Scanner s = new Scanner(System.in);

        //Ask for First Coordinate Point
        System.out.println("Enter the first coordinate point: ");
        String firstPoint = s.nextLine();
        int x1 = Integer.parseInt(firstPoint.substring(firstPoint.indexOf("(") + 1 , firstPoint.indexOf(',')));
        int y1 = Integer.parseInt(firstPoint.substring(firstPoint.indexOf(",") + 1 , firstPoint.indexOf(')')));

        //Ask for Second Coordinate Point
        System.out.println("Enter the second coordinate point: ");
        String secondPoint = s.nextLine();
        int x2 = Integer.parseInt(secondPoint.substring(secondPoint.indexOf("(") + 1 ,secondPoint.indexOf(",")));
        int y2 = Integer.parseInt(secondPoint.substring(secondPoint.indexOf(",") + 1 ,secondPoint.indexOf(")")));

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
        System.out.println("The solved coordinate point is (" + x3 + "," + String.format("%.2f", y3) + ")");
    }
}









