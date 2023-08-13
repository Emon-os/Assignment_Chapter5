package Problem4solution;

public class LetterEquals {
    public void letterequals(String name){
        char first = name.charAt(0);
        char last = name.charAt(name.length()-1);
        if(first == last){
            System.out.println("First and last letter are same.");
        }
        else{
            System.out.println("First and last letter are not same.");
        }
    }
}
