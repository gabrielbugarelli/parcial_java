
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Principal {
    public static void main(String args []){
               
        
    }
    public String gravar(String texto){
        
        try {
            FileWriter arquivo = new FileWriter("C:\\Users\\gabri\\Drive\\DB\\texto.txt");
            PrintWriter gravacao = new PrintWriter(arquivo);
            gravacao.write(texto);
            gravacao.close();
                    
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
        return null;
                
       
    }
    
}
