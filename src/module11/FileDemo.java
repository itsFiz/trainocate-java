package module11;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {

    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("data/input.txt");
            out = new FileOutputStream("data/output.txt");
            int c;
            while((c=in.read())!=-1){
                out.write(c);
            }
            if(in != null)
                in.close();
            if(out != null)
                out.close();
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            // this will run anyway
            System.out.println("This will run anyway");
        }
    }
}
