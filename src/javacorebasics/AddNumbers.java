package javacorebasics;

public class AddNumbers {
    public static void main (String[] args) {
        AddNumbers obj = new AddNumbers();
        obj.add(5,3);
    }
    public int add(int i , int j){
        int sum = i + j ;
        System.out.println("Sum is : "+sum);
        return sum;
    }
}
