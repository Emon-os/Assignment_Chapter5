package Problem3solution;

public class DigitCounter {
    public int digitcount(int number){
        if(number < 0){
            number *= -1;
        }
        int digit = 1;
        while(number >= 10){
            number /= 10;
            digit++;
        }
        return digit;
    }
}
