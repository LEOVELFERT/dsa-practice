import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
    File fileDir=new File("C:\\Files");
        boolean fileDirExisits = fileDir.exists();
        if(!fileDirExisits){
            fileDir.mkdir();
        }else {
            System.out.println("The directory is alrady there");
        }
        File file=new File(fileDir,"dummy.txt");
        boolean createNewFileFlag = file.createNewFile();
        if(!createNewFileFlag){
            System.out.println("the new file has been created sucessfully"+createNewFileFlag);
        }else {
            System.out.println("the file is alrady there");
        }
        System.out.println("the file length is "+file.length());
        FileReader fileReader=new FileReader(file);
//        char[] chars=new char[(int) file.length()];
//        fileReader.read(chars);
//        for(char c:chars){
//            System.out.print(c);
//        }
//        FileWriter fileWriter=new FileWriter(file);
//        fileWriter.write("nandri da nanba");
//        fileWriter.flush();
//        fileWriter.close();

        //code to read the file from the local disk

//        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            System.out.println("The exception happened while reading the files");
//        }

//        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file))){
//            bufferedWriter.write("just appending the new line");
//            bufferedWriter.newLine();
//            bufferedWriter.write("now i have completed the all the lines");
//        }catch (Exception e){
//            System.out.println("The exception happened while getting the data");
//        }
       File sourceFileImage=new File("C:\\Files\\sample_img_1.png");
       File DestionationFileImage=new File("C:\\Files\\sample_img_2.img");

       //Read the bytes from the SourceFile
        byte[] imageData =null;
        try(FileInputStream fis = new FileInputStream(sourceFileImage)){
            imageData =new byte[(int) sourceFileImage.length()];
            fis.read(imageData);
        }catch (Exception e){
            System.out.println("The exception happened while reading the bytes");
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(DestionationFileImage)) {
            fileOutputStream.write(imageData);
            fileOutputStream.flush();
        } catch (Exception e) {
            System.out.println("Exception happened while writing the data");
        }
    }
}
