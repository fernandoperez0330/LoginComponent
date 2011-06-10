
public abstract class LoginComponent {
	public abstract boolean validar(Object DB,String user,String password);
	
	public abstract void success(JLogin jl);
	public abstract void failure(JLogin jl);
}


