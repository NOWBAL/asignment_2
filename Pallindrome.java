package ASSIGNMENT_2;

public class Pallindrome {
    public static void main(String[] args) {
        String palindrome="radar";
        int length=palindrome.length();
        String reverse="";
        for (int i=length-1;i>=0;i--){
            reverse=reverse+palindrome.charAt(i);
        }if(palindrome.equals(reverse)){
            System.out.println("it is a pallindrome");
        }else{
            System.out.println("it is not a pallindrome");
        }
    }
}
