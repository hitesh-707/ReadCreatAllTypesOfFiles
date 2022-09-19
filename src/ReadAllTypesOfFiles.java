import java.io.*;

public class ReadAllTypesOfFiles {
    public static void main(String[] args) throws IOException {
        File fws = new File("//Users//shrunjalmehta//Desktop//TextEdit//myFiles.txt");
        FileReader fcv = new FileReader(fws);
        BufferedReader reader = new BufferedReader(fcv);
        String name = null;
        while ((name = reader.readLine())!=null){
            System.out.println(name);
        }
    reader.close();
    }
}
