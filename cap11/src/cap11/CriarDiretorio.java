package cap11;
import java.io.File;
public class CriarDiretorio {
    public static void main(String[] args) {
        // Criação de Diretorio;
        File dir = new File("/home/edivan/Área de trabalho/GitHub Doc/Java8/cap11/loja");
        if (!dir.exists()){
            dir.mkdir();
        }
        dir = new File("/home/edivan/Área de trabalho/GitHub Doc/Java8/cap11/loja/site");
        if (!dir.exists()){
            dir.mkdir();
        }
        dir = new File("/home/edivan/Área de trabalho/GitHub Doc/Java8/cap11/loja/site/imagens");
        if (!dir.exists()){
            dir.mkdir();
        }
        dir = new File("/home/edivan/Área de trabalho/GitHub Doc/Java8/cap11/loja/site/videos");
        if (!dir.exists()){
            dir.mkdir();
        }
        dir = new File("/home/edivan/Área de trabalho/GitHub Doc/Java8/cap11/loja/site/sons");
        if (!dir.exists()){
            dir.mkdir();
        }
        System.out.println("Final do processo de criação");
    }
    
}
