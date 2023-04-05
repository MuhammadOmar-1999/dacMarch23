
public class Assignment1_6 {
    public static void main (String[] args){
        //a.boolean value into string
        boolean a = false;
        String strB = Boolean.toString(a);
        System.out.println(strB);
        
        //b.boolean value into Boolean instance
        boolean b = true; 
        Boolean B = Boolean.valueOf(b);
        System.out.println(B.booleanValue());
        
        //c.String value into boolean value
        String str = "true";
        boolean c = Boolean.parseBoolean(str);
        System.out.println(c);

        //d.String to boolean instance
        String str1 = "false";
        Boolean d = Boolean.valueOf(str1);
        System.out.println(d.booleanValue());
    }
}
