import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("area of triangle");
        float base = input.nextFloat();
        float height = input.nextFloat();
        double area = (0.5*base*height);
        System.out.println("area of triangle is" +area);


    }
}
