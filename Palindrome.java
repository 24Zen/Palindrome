import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(String A) {
        
        String rev ="";
        for (int i = A.length() -1; i >= 0; i--){
            rev += A.charAt(i);
        }
        return A.equals(rev);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        if (isPalindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

