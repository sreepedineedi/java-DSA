import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("volume of cylinder");
        float radius = input.nextFloat();
        float height = input.nextFloat();
        double volume = (3.14*radius*radius*height);
        System.out.println("volume is" +volume);
    }
}
