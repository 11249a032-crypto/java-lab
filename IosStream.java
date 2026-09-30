import java.io.*;

class iosstream {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("sample.txt");
        out.write("Hello Java File Operations".getBytes());
        out.close();

        FileInputStream in = new FileInputStream("sample.txt");
        int ch;

        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);
        }

        in.close();
    }
}