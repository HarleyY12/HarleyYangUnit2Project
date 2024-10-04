

public class LinearEquation {
    private final int x1;
    private final int x2;
    private final int y1;
    private final int y2;
    private double yIntercept;
    private final double distance;
    private final boolean noSlope;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        if (x1 == x2 ) {
            noSlope = true;
        } else {
            noSlope = false;
            yIntercept = calculateYIntercept();
        }
        distance = calculateDistance();
    }
    private double calculateSlope() {
        return (double) (y2 - y1) / (x2 - x1);
    }
    public double calculateYIntercept() {
        return y1 - calculateSlope() * x1;
    }
    public double calculateDistance() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
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
    public String getEquation() {
        String slopeString = slopeAsFraction();
        String interceptString;
        if (calculateSlope() ==1){
            slopeString = "";
        }
        if (calculateSlope() == -1){
            slopeString = "-";
        }
        if (yIntercept == 0) {
            interceptString = "";
        } else if (yIntercept > 0) {
            interceptString = " + " + String.format("%.2f", yIntercept);
        } else {
            interceptString = " - " + String.format("%.2f", Math.abs(yIntercept));
        }
        return "y = " + slopeString + "x" + interceptString;
    }
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
    public double solveForY3(double x3) {
        return calculateSlope() * x3 + yIntercept;
    }
}
