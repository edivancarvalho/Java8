package cap8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuiMenuPrincipal extends JFrame{
    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplo;
    private JMenuItem miSair, miBotao;
    
    public GuiMenuPrincipal(){
        inicializarComponetes();
        definirEventos();
    }
    
    private void inicializarComponetes(){
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);
        contentPane = getContentPane();
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');
        mnExemplo = new JMenu("Exmplo");
        mnExemplo.setMnemonic('E');
        miSair = new JMenuItem("Sair", new ImageIcon("sair.jpg"));
        miSair.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_S, ActionEvent.ALT_MASK));
        miBotao = new JMenuItem("Botao");
        mnArquivo.add(miSair);
        mnExemplo.add(miBotao);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplo);
        setJMenuBar(mnBarra);
    }
    
    private void definirEventos(){
        miSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         System.exit(0);
            }
        });
    }
    
    public static void abrir(){
        GuiMenuPrincipal frame = new GuiMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2,
        (tela.height - frame.getSize().height) / 2);
    }
}
