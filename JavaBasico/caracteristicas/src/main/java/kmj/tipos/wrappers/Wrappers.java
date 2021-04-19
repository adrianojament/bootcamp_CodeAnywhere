package kmj.tipos.wrappers;

public class Wrappers {
    public static void main(String[] args){
        // Autoboxing -> auto construção da classe

        Byte b = 127; // byte
        Byte b2 = -128;
        Byte nullByte = null;

        Character c1 = 'A'; // char
        Character c2 = 15; // char

        Short s1 = 32767;
        Short s2 = -32768;

        Integer i1 = 2147483647;
        Integer i2 = -2147483648;
        // int i3 = 2147483648;  // to large

        Long l; // 64 bits
        Long l1 = 9223372036854775807L;
        Long l2 = -9223372036854775808L;
        // long l3 = 9223372036854775808L; // to large

        // Flutuantes
        Float f; // 32 bits 3.402,823,5 E+38
        Float f1 = 65f;
        Float f2 = 65.0f;
        Float f3 = -0.5f; // 1.4 E-45

        // Double
        Double d1 = 1024.99;
        Double d2 = 10.2456; // 4.9 E-324

        // Boleano
        Boolean bo1 = true;
        Boolean bo2 = false;

        Boolean bo3 = Boolean.getBoolean("false");
        Boolean bo4 = Boolean.valueOf("true");
    }
}
