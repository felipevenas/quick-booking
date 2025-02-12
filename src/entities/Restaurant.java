package entities;

import java.util.Objects;

public class Restaurant {
	
	private String name;
	private Integer id;
	private String category;
	
	public Restaurant() {}

	public Restaurant(String name, int id, String category) {
		this.name = name;
		this.id = id;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", id=" + id + "]";
	}
	
}
