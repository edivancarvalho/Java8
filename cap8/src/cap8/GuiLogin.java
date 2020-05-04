package cap8;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author suporte
 */
public class GuiLogin extends JFrame{
    
    private JTextField tflogin;
    private JLabel lbSenha;
    private JLabel lbLogin;
    private JButton btLogar;
    private JButton btCancelar;
    private JPasswordField pfSenha;
    private static GuiLogin frame;
    
    public GuiLogin(){
        inicializarComponetes();
        definireventos();
    }

    private void inicializarComponetes() {
        setTitle("Login do Sistema");
        setBounds(0, 0, 250, 200);
        setLayout(null);
        tflogin = new JTextField(5);
        pfSenha = new JPasswordField(5);
        lbSenha = new JLabel("senha:");
        lbLogin = new JLabel("Login:");
        btLogar = new JButton("Logar:");
        btCancelar = new JButton("Cancelar");
        tflogin.setBounds(100, 30, 120, 25);
        lbLogin.setBounds(30, 30, 80, 25);
        lbSenha.setBounds(30, 75, 80, 25);
        btLogar.setBounds(20, 120, 100, 25);
        btCancelar.setBounds(125, 120, 200, 25);
        add(tflogin);
        add(lbSenha);
        add(lbLogin);
        add(btLogar);
        add(btCancelar);
        add(pfSenha);
        
    }
    
    
    
}
