package Problem5solution;

public class HalfLetterEquals {
    public void halfletterequal(String name){
        int length = name.length();
        int halflength = name.length() / 2;
        String firstHalf = name.substring(0,halflength);
        String lasthalf;
        if(length % 2 == 0){
            lasthalf = name.substring(halflength);
        }
        else{
            lasthalf = name.substring(halflength+1);
        }
        if(firstHalf == lasthalf){
            System.out.println("The first half string and last half string are equals");
        }
        else{
            System.out.println("The first half string and last half string are not equals");
        }
    }

}
