package file;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\javatest\\01\\1224.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"));
        String s = br.readLine();
        System.out.println("读取内容是" + s);
        br.close();
    }
}
