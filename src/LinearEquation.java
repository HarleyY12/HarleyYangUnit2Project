



public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private boolean noSlope;
    private String equation;
    



    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String firstPair;

    {
        firstPair = x1 + "," + y1;

    }

    public String secondPair;

    {
        secondPair = x2 + "," + y2;
        
    }

    public double returnSlope;
    {
        returnSlope = (y2-y1)/(x2-x1);

    }

    public double calculateYIntercept;
    {
        calculateYIntercept = y1 - (returnSlope-x1);
    }

    public double calculateDistance;
    {
       calculateDistance = Math.sqrt(Math.pow(x2-x1,2))+ Math.pow(y2-y1,2);
    }




    }




