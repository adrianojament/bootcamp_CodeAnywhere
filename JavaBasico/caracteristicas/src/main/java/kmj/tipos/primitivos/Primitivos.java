package kmj.tipos.primitivos;

public class Primitivos {
    public static void main(String[] args){

        // Inteiros
        byte b; // 8 bits
        byte b1 = 127;
        byte b2 = -128;
        // byte b3 = 129; to large

        char c; // 16 bits
        char c1 = 'A';
        char c2 = 15;
        // char c3 = 'AA'; // NOK
        // char c4 = -100; // NOK

        short s;  // 16 bits
        short s1 = 32767;
        short s2 = -32768;

        int i;  // 32 bits
        int i1 = 2147483647;
        int i2 = -2147483648;
        // int i3 = 2147483648;  // to large

        long l; // 64 bits
        long l1 = 9223372036854775807L;
        long l2 = -9223372036854775808L;
        // long l3 = 9223372036854775808L; // to large

        // Flutuantes
        float f; // 32 bits 3.402,823,5 E+38
        float f1 = 65f;
        float f2 = 65.0f;
        float f3 = -0.5f; // 1.4 E-45

        // Double
        double d;  // 64 bits 1.797,693,134862,315,7 E+308
        double d1 = 1024.99;
        double d2 = 10.2456; // 4.9 E-324

        // Boleano
        boolean bo1 = true;
        boolean bo2 = false;
    }
}
