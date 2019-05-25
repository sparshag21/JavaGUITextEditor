
package FileFunctions;
import java.io.*;
public class FileFunctions {
    public String read(String filename) {
        String data = "";
        try {
        FileInputStream fis = new FileInputStream(filename);
        int ch = fis.read();
        while(ch!=-1) {
            data = data + (char)ch;
            ch = fis.read();
        }
        fis.close();
        }
        catch(Exception e) {
        System.out.println(e);
        }
        return data;
    }
    
    public void write(String filename, String data) {
        try {
        FileOutputStream fos = new FileOutputStream(filename);
        for(int i = 0; i < data.length(); i++) {
            fos.write((int)data.charAt(i));
        }
        fos.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}