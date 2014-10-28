import java.io.*;

import java.util.*;

public class ProcessBuilderPrueba { 

    public static void main(String [] args) throws IOException {
        
        String[] comando = {"CMD", "/C", "dir"};
        
        ProcessBuilder probuilder = new ProcessBuilder( comando );

        
        probuilder.directory(new File("c:\\demo"));
        
        Process proceso = probuilder.start();
        
        
        InputStream is = proceso.getInputStream();
        
        InputStreamReader isr = new InputStreamReader(is);
        
        BufferedReader br = new BufferedReader(isr);
        
        String line;
        
        System.out.printf("Output of running %s is:\n",
               
                Arrays.toString(comando));
      
        while ((line = br.readLine()) != null) {
          
            System.out.println(line);
      
        }
        
    }
}