public class Assignment1_8 {
    public static void main (String[] args){
        //a.byte value to String
        byte a = 20;
        String strByte = Byte.toString(a);
        System.out.println(strByte);
        
        //b.byte value to Byte instance
        byte b = 25;
        Byte B = Byte.valueOf(b);
        System.out.println(B.byteValue());

        //c.String instance to Byte instance
        String strb = "123";
        Byte C = Byte.valueOf(strb); 
        System.out.println(C.byteValue());
    }
}
