package vo;

public class ActionForward {
	private boolean redirect;
	private String path;
	
	public boolean isRedirect(){
		return redirect;
	}
	
	public String getPath(){
		return path;
	}
	
	public void setRedirect(boolean redirect){
		this.redirect=redirect;
	}
	
	public void setPath(String path){
		this.path=path;
	}
}