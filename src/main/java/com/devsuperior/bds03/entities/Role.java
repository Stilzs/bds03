package com.devsuperior.bds03.entities;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.Objects;
=======
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_role")
<<<<<<< HEAD
public class Role implements Serializable{
	private static final long serialVersionUID = 1L;
	
=======
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String authority;
	
	public Role() {
	}

	public Role(Long id, String authority) {
		super();
		this.id = id;
		this.authority = authority;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public int hashCode() {
<<<<<<< HEAD
		return Objects.hash(id);
=======
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
<<<<<<< HEAD
		return Objects.equals(id, other.id);
=======
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	}
}
