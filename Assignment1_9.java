public class Assignment1_9 {
    public static void main (String[] args){
        Byte B = new Byte((byte)122);
        //Byte instance to byte
        byte b = B.byteValue();
        //Byte instance to short
        short s = B.shortValue();
        //Byte instance to int
        int i = B.intValue();
        //Byte instance to long
        long l = B.longValue();
        //Byte instance to float
        float f = B.floatValue();
        //Byte instance to double
        double d = B.doubleValue();
        System.out.println("Byte instance into:");
        System.out.println("byte value: "+b);
        System.out.println("short value: "+s);
        System.out.println("integer value: "+i);
        System.out.println("long value: "+l);
        System.out.println("float vlaue: "+f);
        System.out.println("double value: "+d);
        


    }
}
