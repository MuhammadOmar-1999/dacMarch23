import java.util.Scanner;
public class Assignment1_11 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        char c = str.charAt(0);
        int codePoint = 0;
        if(Character.isDigit(c)){
            System.out.println(Character.digit(c,10));
            codePoint = Character.codePointAt(Character.toString(c),0);
            System.out.println(codePoint);
            /*codePointAt() takes one String and one int parameter */
        }
        else{
            if(Character.isUpperCase(c)){
                char C = Character.toLowerCase(c);
                System.out.println(C);
                codePoint = Character.codePointAt(Character.toString(C),0);
                System.out.println(codePoint);
            }
            else{
                char C = Character.toUpperCase(c);
                System.out.println(C);
                codePoint = Character.codePointAt(Character.toString(C),0);
                System.out.println(codePoint);
            }
        }
    }
}
