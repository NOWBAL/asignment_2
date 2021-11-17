package ASSIGNMENT_2;

public class factorial_number {
    public static void main(String[] args) {
        int num=5;
        long factorial=multiplyNumbers(num);
        System.out.println("factorial of "+num);
    }public static long multiplyNumbers(int num){
        if(num>=1)
            return num*multiplyNumbers(num-1);
        else
            return 1;
    }

}
