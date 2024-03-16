import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("area of circle");
        float radius = input.nextFloat();
          double area = (3.14*radius*radius);

        System.out.println("area is" +area);

    }


}
