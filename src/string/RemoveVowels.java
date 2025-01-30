package string;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "automation";
        String bucket = "";
        for (int i=0;i<str.length();i++)
        {
            char chr = str.charAt(i);
            if (chr != 'a' && chr != 'e' && chr != 'o' && chr != 'u' && chr != 'i' )
            {
                bucket += chr;
                System.out.println("Log");
            }
            else
            {
                System.out.println("No Vowels");
            }

        }
        System.out .println("Bucket:" + bucket);
    }
}
