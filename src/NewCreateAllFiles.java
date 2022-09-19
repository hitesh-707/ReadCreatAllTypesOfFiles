import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewCreateAllFiles {
    public static void main(String[]args) throws IOException {
        File f = new File(" ");
        FileWriter fgg = new FileWriter(f);
        BufferedWriter writer = new BufferedWriter(fgg);
        writer.write("Hitesh");
        writer.newLine();
        writer.write("solanki");
        writer.newLine();
        writer.close();
        System.out.println("FILES HAS BEEN CREATED SUCCESSFULLY");

    }
}
