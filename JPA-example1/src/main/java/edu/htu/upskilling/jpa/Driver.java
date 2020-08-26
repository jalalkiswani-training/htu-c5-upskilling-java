package edu.htu.upskilling.jpa;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "driver")
public class Driver implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private Integer age;

	@Column(name = "email")
	private String email;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(this.name).append(" ");
		buf.append(",");
		buf.append(this.age).append(" ");
		buf.append(",");
		buf.append(this.email).append(" ");
		return buf.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return this.getId() == ((Driver) obj).getId();
	}

	@Override
	public int hashCode() {
		if (this.id == null) {
			return toString().hashCode();
		}
		return this.id.hashCode();
	}

}