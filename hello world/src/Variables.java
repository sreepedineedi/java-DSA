public class Variables {
    public static void main(String[] args) {
        System.out.println("size of Integer data type is " + (Integer.SIZE / 8) + " bytes or " + (Integer.SIZE) + " bits");
        System.out.println("The range of an integer is from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);// 2^-31 to (2^31)-1  hence it is based on 2's complement representation
        System.out.println("size of double data type is " + (Double.SIZE / 8) + " bytes or " + (Double.SIZE) + " bits");
        System.out.println("The range of a double is from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);// 2^-63 to (2^63)-1
        System.out.println("The size of float data type is " + (Float.SIZE / 8) + " bytes or " + (Float.SIZE) + " bits");
        System.out.println("The size of char is " + Character.SIZE / 8 + " bytes or " + Character.SIZE + " bits");
        System.out.println("The size of byte data type is " + Byte.SIZE / 8 + " bytes or " + Byte.SIZE + " bits");
        System.out.println("The size of short data type is " + Short.SIZE / 8 + " bytes or " + Short.SIZE + " bits");
        System.out.println("The size of long data type is " + Long.SIZE / 8 + " bytes or " + Long.SIZE + " bits");
        // Declaration of a variable is nothing but just creating a variable
        double num = 21474836474.0;
        byte age = -128;
        short a = -32768;
        double b = 1.844674407;
        char d = 'c';
        float f = 13.5f;
        int longnumber = 3_44_257;

         }
}
