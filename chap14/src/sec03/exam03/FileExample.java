package sec03.exam03;   //File 클래스를 이용해 폴더와 파일을 생성하고, 파일 목록 출력

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir1 = new File("/Users/wonjuxx/Documents/Temp/images");
        File file1 = new File("/Users/wonjuxx/Documents/Temp/file1.txt");
        File file2 = new File("/Users/wonjuxx/Documents/Temp/file2.txt");
        File file3 = new File("/Users/wonjuxx/Documents/Temp/file3.txt");

        if(dir1.exists() == false) { dir1.mkdirs(); }
        if(file1.exists() == false) { file1.createNewFile(); }
        if(file2.exists() == false) { file2.createNewFile(); }
        if(file3.exists() == false) { file3.createNewFile(); }

//        File temp = new File("/Users/wonjuxx/Documents/Temp");
        File[] contents = new File("/Users/wonjuxx/Documents/Temp").listFiles();

        System.out.println("시간\t\t\t형태\t\t크기\t이름");
        System.out.println("-------------------------------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for(File file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()) {
                System.out.println("\t<DIR>\t\t\t" + file.getName());
            } else {
                System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
            }
        }
    }
}
