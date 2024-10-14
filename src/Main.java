import java.io.File;

public class Main {
    public static void main(String[] args) {

        File  file=new File("C:\\Files\\dummy.txt");
        file.exists();
        System.out.println(file.exists());
    }
}