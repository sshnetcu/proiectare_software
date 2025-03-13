package ro.ulbs.paradigme.lab3.util;

public class StringRandomizer {
    public String generateString(int length) {
        char[] a = new char[length];
        for (int i = 0; i < length; i++) {
            a[i] = (char) (Math.floor(Math.random() * 93) + 32);
        }
        return new String(a);
    }
    public String extractRandom(String input, int length) {
        char[] a = new char[length];
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < length; i++) {
            char[] b = sb.toString().toCharArray();
            int n = (int) Math.floor(Math.random() * (b.length - 1));
            a[i] = b[n];
            sb.deleteCharAt(n);
        }
        return new String(a);
    }
}
