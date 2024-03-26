package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "UserId",length = 10)
	private int id;
	
	@Column(name="UserName", nullable = false)
	private String userName;

	@Column(name="Password", nullable = false)
	private String passoword;
	
	@Column(name="Email", nullable = false)
	private String email;
	
	@Column(name="Phone")
	private String phone;
	
	@ManyToOne
	private Role role;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String userName, String passoword, String email, String phone, Role role) {
		super();
		this.userName = userName;
		this.passoword = passoword;
		this.email = email;
		this.phone = phone;
		this.role = role;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassoword() {
		return passoword;
	}


	public void setPassoword(String passoword) {
		this.passoword = passoword;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passoword=" + passoword + ", email=" + email
				+ ", phone=" + phone + ", role=" + role + "]";
	}
	
	
	
}
