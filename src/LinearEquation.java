//New Class
public class LinearEquation {
    //Instance Variables
    private final int x1;
    private final int x2;
    private final int y1;
    private final int y2;
    private double yIntercept;
    private final double distance;
    private final boolean noSlope;

    //Constructor
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        //Check If Line is Vertical
        if (x1 == x2 ) {
            noSlope = true;
        } else {
            noSlope = false;
            yIntercept = calculateYIntercept();
        }
        distance = calculateDistance();
    }
    //Method to Calculate Slope
    private double calculateSlope() {
        return (double) (y2 - y1) / (x2 - x1);
    }
    //Method to Calculate Y-Intercept
    public double calculateYIntercept() {
        return y1 - calculateSlope() * x1;
    }
    //Method to Calculate the Distance Between 2 Points
    public double calculateDistance() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    //Method to Return the Slope as a Fraction String
    public String slopeAsFraction() {
        int numerator = y2 - y1;
        int denominator = x2 - x1;
        if (denominator < 0){
            denominator = Math.abs(denominator);
            numerator = -numerator;
        }
        if (numerator / denominator == 1) {
            return "1";
        }
        if (numerator / denominator == -1) {
            return "-1";
        }
        if (numerator % denominator == 0) {
            return Integer.toString(numerator / denominator);
        } else {
            return numerator + "/" + denominator;
        }
    }
    //Method to Return the Linear Equation as a String
    public String getEquation() {
        String slopeString = slopeAsFraction();
        String interceptString;
        // Rewrites Slope as "" if 1 or "-" if -1
        if (calculateSlope() == 1){
            slopeString = "";
        }
        if (calculateSlope() == -1){
            slopeString = "-";
        }
        //Format the Y-Intercept String
        if (yIntercept == 0) {
            interceptString = " ";
        }else if (yIntercept > 0) {
            interceptString = " + " + String.format("%.2f", yIntercept);
        }else{
            interceptString = " - " + String.format("%.2f", Math.abs(yIntercept));
        }
        return "y = " + slopeString + " x " + interceptString;
    }
    //Returns Details of Linear Equation
    public String toString() {
        if (noSlope) {
            return "First point: (" + x1 + "," + y1 + ")\n" +
                    "Second point: (" + x2 + "," + y2 + ")\n" +
                    "Distance between the points: " + String.format("%.2f",distance) + "\n" +
                    "There is no slope;there is no linear equation.";
        }
        else {
            return  "First point: (" + x1 + "," + y1 + ")\n" +
                    "Second point: (" + x2 + "," + y2 + ")\n" +
                    "Distance between the points: " + String.format("%.2f",distance) + "\n" +
                    "Equation of the line: " + getEquation() + "\n" +
                    "Slope: " + slopeAsFraction() + "\n" +
                    "Y-intercept: " + String.format("%.2f",yIntercept);
        }
    }
    //Method to Solve for the Y-Value of a 3rd Coordinate Point Given x3
    public double solveForY3(double x3) {
        return calculateSlope() * x3 + yIntercept;
    }
}




