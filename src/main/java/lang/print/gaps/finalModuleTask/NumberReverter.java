package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int rev=0;
        while(number>0){
            int temp=number%10;
            rev=rev*10+temp;
            number/=10;
        }
        System.out.println(rev);
    }
}
