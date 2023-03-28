import java.util.Scanner;

/*class Palindrome{
    public static void main(String args[]){
        int r,sum=0,temp;
        int n=454;

        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}*/
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz słowo");
        String str = scan.nextLine();


        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");


        boolean isPalindrom = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrom = false;
                break;
            }
        }


        if (isPalindrom) {
            System.out.println(str + " jest palindromem");
        } else {
            System.out.println(str + " nie jest palindromem");
        }
    }
}