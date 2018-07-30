import java.util.Scanner;

public class Main {

    public static class findSquare {
        public double findSquare(double x1, double x2, double y1, double y2){
            return Math.abs((x2 - x1) *(y2 - y1));
        }
    }
    public static class general{
        public double Square(double x1, double x2, double y1, double y2){
            return (Math.pow(x1-x2,2)+Math.pow(y1-y2,2))/2;
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("|Input (x,y) coordinates of your first and second point| :");
        double x1=in.nextDouble();
        double y1=in.nextDouble();
        double x2=in.nextDouble();
        double y2=in.nextDouble();

        findSquare F = new findSquare();
        general G = new general();
        System.out.println("The square of ur figure with sides parallel to the axes  = "+F.findSquare(x1,x2,y1,y2));
        System.out.println("The square of ur figure in general situation is between(not inclusive) 0 and "+G.Square(x1,x2,y1,y2));

    }

}