import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
//        calling calculate circle area method
        calculateCircleArea();
    }

    //method declaration
    static double calculateCircleArea(){
        Scanner scan = new Scanner(System.in);
//        asking user for input
        System.out.println("Enter the radius of circle :");
        double radius =scan.nextDouble();
        double area = Math.PI*(radius*radius);
        System.out.println("Area of circle is : "+area);
        return area;

    }
}
