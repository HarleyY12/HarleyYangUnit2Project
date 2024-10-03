public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double slope;
    private double yIntercept;
    private double distance;
    private boolean noSlope;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        if (x1 == x2) {
            noSlope = true;
        } else {
            noSlope = false;
            slope = calculateSlope();
            yIntercept = calculateYIntercept();
        }
        distance = calculateDistance();
    }

    private double calculateSlope() {
        return (double) (y2 - y1) / (x2 - x1);
    }

    public double calculateYIntercept() {
        return y1 - slope * x1;
    }

    public double calculateDistance() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public String slopeAsFraction() {
        int numerator = y2 - y1;
        int denominator = x2 - x1;
        if (numerator % denominator == 0) {
            return Integer.toString(numerator / denominator);
        } else {
            return numerator + "/" + denominator;
        }
    }
    public String getEquation() {
        if (noSlope) {
            return "There is no slope and no linear equation";
        }
        String slopeString = slopeAsFraction();

        String interceptString;
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
        String result = "First point: (" + x1 + ", " + y1 + ")\n" +
                "Second point: (" + x2 + ", " + y2 + ")\n" +
                "Distance between the points: " + String.format("%.2f", distance) + "\n";
        if (noSlope) {
            result += "The line is vertical; slope is undefined.\n";
        } else {
            result += "Equation of the line: " + getEquation() + "\n" +
                    "Slope: " + slopeAsFraction() + "\n" +
                    "Y-intercept: " + String.format("%.2f", yIntercept) + "\n";
        }
        return result;
    }
}






