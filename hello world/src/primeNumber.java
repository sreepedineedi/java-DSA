public class primeNumber {
   public static void main(String[] args)
    {
        int num = 19;
        int c = 2;
        boolean isPrime = true;
        while(c < num)
        {
            if(num % c == 0)
            {
                isPrime = false;
                break;
            }
            else
            {
                c = c+1;
            }
        }
        if(isPrime == true)
        {
            System.out.println("prime number");


        }
        else {
            System.out.println("not a prime");
        }

    }
}
