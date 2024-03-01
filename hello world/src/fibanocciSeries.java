public class fibanocciSeries {
    public static void main(String args[])
    {
        int firstNum = 0;
        int secNum = 1;
        int thirdNum;
//        0,1,1,2,3,5
        for (int i = 0; i < 10; i++) {
            System.out.print(firstNum +" " );
            thirdNum = firstNum + secNum;
            firstNum =secNum;
            secNum = thirdNum;



        }

    }
}
