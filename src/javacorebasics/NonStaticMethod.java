package javacorebasics;

public class NonStaticMethod {
    public static void main (String[] args) {
        NonStaticMethod obj = new NonStaticMethod();
        obj.add();
    }
    public void add(){
        System.out.println("Non-Static Method");
    }
}
