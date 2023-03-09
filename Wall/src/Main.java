import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter width number- ");
        double a= sc. nextDouble();
        System.out.print("Enter Height number- ");
        double b= sc. nextDouble();
        Wall wall = new Wall(5,4);
        System.out.println("area = " + wall.getArea());
        //wall.setHeight(-1.5);
        wall.setWidth(a);
        wall.setHeight(b);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    } // main method

}