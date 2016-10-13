package pack_analy_resrh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author isuru
 */
public class Pack_Analy_Resrh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String tmp;
        Process p;
        BufferedReader br;
        
        try{
            p = Runtime.getRuntime().exec("ls -l");
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            while ((tmp = br.readLine())!= null) {                
                System.out.println(tmp);
            }
            
        }catch(IOException e){
            System.out.println("Problem with command");
        }
    }
    
}
