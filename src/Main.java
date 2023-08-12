// Побитовые операторы. Bitwise operators

public class Main {
    public static void main(String[] args) {
        int i = 15;
        String binaryString = Integer.toBinaryString(i);
        System.out.println("Число " + i + " в двоичной системе счисления = " + binaryString); // 15 = 1111

        int i2 = 10;
        String binaryString2 = Integer.toBinaryString(i2);
        System.out.println("Число " + i2 + " в двоичной системе счисления = " + binaryString2); // 10 = 1010

        int i3 = 100;
        String binaryString3 = Integer.toBinaryString(i3);
        System.out.println("Число " + i3 + " в двоичной системе счисления = " + binaryString3); // 100 = 1100100

        int i4 = 92;
        String binaryString4 = Integer.toBinaryString(i4);
        System.out.println("Число " + i4 + " в двоичной системе счисления = " + binaryString4); // 92 = 1011100
    }
}