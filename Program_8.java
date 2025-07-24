import java.util.*; 
class Program_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

       System.out.println("Enter the character : ");
       char ch = sc.next().charAt(0);
    System.out.println((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) ? "The character is a vowel" : "The character is a consonant");
    }
}
