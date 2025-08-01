import java.util.*;
class Program_10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        if (age >=21){
            System.out.println("The person is eligible to marry");
        }
        else{
            System.out.println("The person is not eligible to marry");
        }
        sc.close();
    }
}
