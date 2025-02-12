package entities;

import java.util.Date;
import java.util.Objects;

public class User {
	
	private String name;
	private String email;
	private Date booking;
	private Integer id;
	
	public User() {}
	
	public User(String name, String email, Date booking, int id) {
		this.name = name;
		this.email = email;
		this.booking = booking;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBooking() {
		return booking;
	}

	public void setBooking(Date booking) {
		this.booking = booking;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}
	
	
}
