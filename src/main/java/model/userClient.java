package model;

public class userClient {
	private String username;
    private String password;
    private String email;
    private String cpf;
    private String Address;
	public userClient(String username, String password, String email, String cpf, String address) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.cpf = cpf;  // usar o validador de cpf seja criando proprio ou usando API
		Address = address;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
    
    
    
    
    
}