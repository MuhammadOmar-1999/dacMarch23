public class Assignment1_14 {
    public static void main(String[] args){
        Short S = new Short((short)13);
        short s = S.shortValue();
        byte b = S.byteValue();
        int i = S.intValue();
        long l = S.longValue();
        float f = S.floatValue();
        double d = S.doubleValue();
        System.out.println("Short instance into:");
        System.out.println("byte value: "+b);
        System.out.println("short value: "+s);
        System.out.println("integer value: "+i);
        System.out.println("long value: "+l);
        System.out.println("float vlaue: "+f);
        System.out.println("double value: "+d);
    }

}
