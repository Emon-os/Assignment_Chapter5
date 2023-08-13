package Problem6solution;

public class AllSame {
    public void AllNumberSame(int num1, int num2, int num3){
        if(num1 == num2 && num2 == num3){
            System.out.println("All number are same");
        }
        else if(num1 != num2 && num2 != num3 && num3 != num1){
            System.out.println("All number are different");
        }
        else{
            System.out.println("Neither!");
        }
    }
}
