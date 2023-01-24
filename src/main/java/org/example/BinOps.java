package org.example;

public class BinOps {
    public String sum(String a, String b) {
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        String sum = Integer.toBinaryString(aa + bb);
        return sum;
    }

    public String mult(String a, String b) {
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        String mult = Integer.toBinaryString(aa * bb);
        return mult;
    }
}
