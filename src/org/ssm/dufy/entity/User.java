package org.ssm.dufy.entity;

public class User {
	private Integer id;
	private Integer age;
	private String name;
	private String password;
	
	public User() {
		super();
	}

	public User(Integer id, Integer age, String name, String password) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User : [id = "+id+", age = "+age+", name = "+name+", password = "+password+"]";
	}	
}
