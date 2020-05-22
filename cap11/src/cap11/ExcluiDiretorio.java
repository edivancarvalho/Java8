package cap11;
import java.io.File;
public class ExcluiDiretorio {
    public static void main(String[] args) {
        File dir = new File("/home/edivan/Área de trabalho/GitHub Doc/Java8/cap11/loja");
        String men = "";
        if (dir.isDirectory()) {
            if (dir.delete()) {
                men = dir.getName() + " Excluido com sucesso!";
            } else {
                if (excluirFilhos(dir)) {
                    men = dir.getName() + " Excluido com sucesso!";
                } else {
                    men = "Falha na exclusão de " + dir.getName();
                }
            }
            System.out.println(men);
        }
    }
    private static boolean excluirFilhos(File dir) {
        if (dir.isDirectory()) {
            String[] arquivos = dir.list();
            for (int i = 0; i < arquivos.length; i++) {
                boolean sucess = excluirFilhos(new File(dir, arquivos[i]));
                if (sucess){
                    System.out.println("Excluido: " + arquivos[i]);
                }else {
                    System.out.println("Não poder ser excluido: " + arquivos[i]);
                    return false;
                }
            }
        }
        return dir.delete();
    }
}
