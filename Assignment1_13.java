public class Assignment1_13 {
    public static void main(String[] args){
        short s1 = 12;
        String str1 = Short.toString(s1);
        System.out.println(str1);
        Short S = new Short(s1);
        System.out.println(S.shortValue());
        String str2 = "13";
        short s2 = Short.parseShort(str2);
        System.out.println(s2);
    }   
}
