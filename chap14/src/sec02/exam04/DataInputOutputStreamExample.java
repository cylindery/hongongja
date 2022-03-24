package sec02.exam04;   //기본 타입 입출력 보조 스트림. 동일한 순서로 읽어오고 출력한다

import java.io.*;

public class DataInputOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/wonjuxx/Documents/Temp/primitive.db");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("홍길동");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("김자바");
        dos.writeDouble(90.3);
        dos.writeInt(2);

        dos.flush();

        FileInputStream fis = new FileInputStream("/Users/wonjuxx/Documents/Temp/primitive.db");
        DataInputStream dis = new DataInputStream(fis);

        for(int i=0; i<2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }

        dis.close();
    }
}
