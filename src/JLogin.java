import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JLogin extends JFrame{
	/**********************Modificable**********************************/
	 //titulo del frame del login
	static String title = "Formulario de Login";
	//mensaje cuando retorna true metodo validar
	String msgSuccess = "Bienvenido al sistema";
	//mensaje cuando retorna false metodo validar
	String msgError = "Nombre de usuario y/o clave incorrecta";
	//valor del boton de login
	String valbtnLogin = "Login";
	//valor del label del usuario
	String vallabelUser = "Usuario.:";
	//valor del label del usuario
	String vallabelPass = "Contrasena.:";
	//vaor del boton de login
	String valbtnOlvide = "Olvidaste Contrasena?";
	
	boolean SUCCESSED = false;
	
	JLogin(){ super(title); }
	
	public void showFrame(Object parent,LoginComponent lc){
		JLogin jl = new JLogin(); 
		jl.getContentPane().add(jl.loginPanel(lc));
		jl.setDefaultCloseOperation( EXIT_ON_CLOSE );
		jl.setResizable(false);
		jl.setSize(600, 100);
		jl.setVisible(true);
	}
	
	public JPanel loginPanel(final LoginComponent lc){
		JLabel labelUser = new JLabel(vallabelUser);
		final JTextField inputUser = new JTextField();
		JLabel labelPass = new JLabel(vallabelPass);
		final JTextField inputPass = new JTextField();
		JButton btnLogin = new JButton(valbtnLogin);
		JButton btnOlvide = new JButton(valbtnOlvide);
		inputUser.setPreferredSize(new Dimension(200,30));
		inputPass.setPreferredSize(new Dimension(200,30));
		
		//action listener del boton logi
		btnLogin.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (lc.validar(new Object(),inputUser.getText(),inputPass.getText())){
					lc.success(new JLogin());
				}else lc.failure(new JLogin());
			}
		});
		
		//action listener del boton olvide clave
		btnOlvide.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			}
		});
		
		JPanel formLogin = new JPanel();
		formLogin.add(labelUser);
		formLogin.add(inputUser);
		formLogin.add(labelPass);
		formLogin.add(inputPass);
		formLogin.add(btnLogin);
		formLogin.add(btnOlvide);
		return formLogin;
		
	}
	/*NO MODIFICAR*/
}

	