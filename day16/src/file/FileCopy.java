package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String srcFilePath = "D:\\javatest\\01\\1224.txt";
        String destFilePath = "D:\\javatest\\02\\1224.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            byte[] buf = new byte[1024];//也可以单个字节读取，即为byte[8]
            int readlen = 0;
            while ((readlen = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf, 0, readlen);
            }
            System.out.println("拷贝完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
