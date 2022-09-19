import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatTypesAllFiles {
    public static void main(String[] args) throws IOException {

        //Text File mate
        File f = new File("//Users//shrunjalmehta//Desktop//TextEdit//myFiles.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter writer = new BufferedWriter(fw);
        writer.write("Hello Hitesh bhai");
        writer.newLine();
        writer.write("Kem cho maja ma?");
        writer.newLine();
        writer.write("bas sukh santi");
        writer.close();
        System.out.println("File Create successfully");


        //csv mate
        File fi = new File("//Users//shrunjalmehta//Desktop//TextEdit//myFiles.csv");
        FileWriter fwc = new FileWriter(fi);
        BufferedWriter writers = new BufferedWriter(fwc);
       /* writers.write("Hello Hitesh bhai");
        writers.newLine();
        writers.write("Kem cho maja ma?");
        writers.newLine();
        writers.write("bas sukh santi");*/


        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                int sum = (int)(Math.random()*100);
                writers.write(sum);
            }
            writers.newLine();
        }
        writers.close();
        System.out.println("File Create successfully");

        File fe = new File("//Users//shrunjalmehta//Desktop//TextEdit//myFiles.html");
        FileWriter fwe = new FileWriter(fe);
        BufferedWriter writerss = new BufferedWriter(fwe);
        writerss.write("<html><body><title>way To Automation<h1>Learning Java</h1></title></body></html>");
        writerss.newLine();
        writerss.close();
        System.out.println("File Create successfully");

        }
}
