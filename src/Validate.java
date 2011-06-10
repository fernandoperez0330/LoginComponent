import javax.swing.JOptionPane;


public class Validate extends LoginComponent{

	@Override
	public boolean validar(Object DB,String user,String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void success(JLogin jl) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(jl,jl.msgSuccess);
	}

	@Override
	public void failure(JLogin jl) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(jl,jl.msgError);
	}

}
