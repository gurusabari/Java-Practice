package javacorebasics;

public class EvenNumbers {
    public static void main (String[] args) {
        EvenNumbers obj = new EvenNumbers();
        obj.add(5,4);
    }
    protected int add(int i , int j){
        int sum = i + j ;
        if (sum % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
        System.out.println("Sum is : "+sum);
        return sum;
    }
}
