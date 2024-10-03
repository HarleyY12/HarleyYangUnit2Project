public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double slope;
    private double yIntercept;
    private double distance;
    private boolean noSlope;
    private String equation;


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

    private String firstPair(){

        return ( x1 + "," + y1);
    }


    private String secondPair() {
        return ( x2 + ", " + y2 );
    }

    
    private double calculateSlope() {
        return (double) (y2 - y1) / (x2 - x1);

    }

    public double calculateYIntercept() {
        return  y1 - ( slope * x1 );
    }

    public double calculateDistance() {
        return  Math.sqrt(Math.pow( x2 - x1, 2 )) + Math.pow( y2 - y1, 2 );
    }



}




