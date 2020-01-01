import java.io.BufferedReader;
import java.io.InputStreamReader;

//import java.io.*;
public class GameHelper{
    String getUserinput(String prompt){
        String inputline = null;
        System.out.println(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader((System.in)));
            inputline = is.readLine();
            if(inputline.length() == 0){
                return null;}
        } catch (Exception e) {
            System.out.println("IOException : " + e);
        }
        return inputline;
    }

}
