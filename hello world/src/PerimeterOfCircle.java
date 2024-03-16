import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("perimeter is");
        float radius = input.nextFloat();
        double perimeter = (3.14*radius);
        System.out.println("perimeter is" +perimeter);

    }

}
