import java.util.*;
class Program_11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
       for (int i = 1; i <= 10; i++){
        if (i == num){
            System.out.println("Good Morning");
        }

       else { System.out.println(i);
       }
    }
    sc.close();
}
}
