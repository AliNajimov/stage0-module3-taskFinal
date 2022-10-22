package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum=0;
        int oneD, twoD, threeD, fourD;
        oneD = number/1000;
        twoD = (number%1000)/100;
        threeD = (number%100)/10;
        fourD = number%10;
        sum=oneD+twoD+threeD+fourD;
        System.out.println(sum);
    }
}
