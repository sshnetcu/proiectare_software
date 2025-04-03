package ro.ulbs.paradigme.lab5;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            modifyTextFile();
        } catch (IOException _) {}
    }

    static void modifyTextFile() throws IOException {
        Path path = Paths.get("in.txt");
        StringBuilder sb = new StringBuilder();
        String s = "";
        try (Scanner scanner = new Scanner(path)){
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
                sb.append('\n');
            }
            s = sb.toString();
            String[] split = s.split("\\.");
            for (String str : split) {
                str = str + '\n';
            }
            s = Arrays.toString(split);
        }

        Files.write(Paths.get("out.txt"), s.getBytes());
    }
}

