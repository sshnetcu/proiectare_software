package ro.ulbs.paradigme.lab3.util;

public class PasswordMaker extends StringRandomizer {
    final private int MAGIC_NUMBER = 7;
    final private String magicString = generateString((int) (Math.floor(Math.random() * 100) + 20));
    private String password;

    public PasswordMaker(String name) {
        this.password = generateString(MAGIC_NUMBER) + extractRandom(magicString, 10) + name.length() + (int) Math.floor(Math.random() * 50);
    }
    public String getPassword() {
        return password;
    }
}
