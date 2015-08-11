package demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Friends {
	@Id
	private int id;
	@Column
	private String user_id;
	@Column
	private String name;
	
	
	
	public Friends() {
	}

	public Friends(int id, String user_id, String name) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "jiwonmodel [id=" + id + ", user_id=" + user_id + ", name="
				+ name + "]";
	}
	
	
	
}
