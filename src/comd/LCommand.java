package comd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCommand {
    
    public BufferedReader runCommand(String comd) throws IOException{
        Process p;
        BufferedReader br;
        
        p = Runtime.getRuntime().exec(comd);
        br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        
        return br;
    }
    
}
