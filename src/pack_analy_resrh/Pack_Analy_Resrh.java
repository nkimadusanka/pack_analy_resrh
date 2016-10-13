package pack_analy_resrh;

import comd.LCommand;
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
        LCommand lc;
        BufferedReader br;
        
        try{
            lc = new LCommand();
            br = lc.runCommand("lshw");
            
            while ((tmp = br.readLine())!= null) {                
                System.out.println(tmp);
            }
            
        }catch(IOException e){
            System.out.println("Problem with command");
        }
    }
    
}
