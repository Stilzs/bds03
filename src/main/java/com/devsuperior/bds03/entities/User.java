package com.devsuperior.bds03.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
<<<<<<< HEAD
import java.util.Objects;
=======
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "tb_user")
<<<<<<< HEAD
public class User implements UserDetails, Serializable{
	private static final long serialVersionUID = 1L;
	
=======
public class User implements UserDetails, Serializable {
	private static final long serialVersionUID = 1L;

>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String email;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_user_role",
		joinColumns = @JoinColumn(name = "user_id"),
<<<<<<< HEAD
		inverseJoinColumns = @JoinColumn(name = "role_id"))
=======
		inverseJoinColumns = @JoinColumn(name = "role_id"))	
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	private Set<Role> roles = new HashSet<>();
	
	public User() {
	}
<<<<<<< HEAD
	

	public User(Long id, String email, String password, Set<Role> roles) {
=======

	public User(Long id, String email, String password) {
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
		super();
		this.id = id;
		this.email = email;
		this.password = password;
<<<<<<< HEAD
		this.roles = roles;
	}


=======
	}

>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
<<<<<<< HEAD

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
=======
	
	public Set<Role> getRoles() {
		return roles;
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	}

	@Override
	public int hashCode() {
<<<<<<< HEAD
		return Objects.hash(id);
	}

	public Set<Role> getRoles() {
		return roles;
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
		User other = (User) obj;
<<<<<<< HEAD
		return Objects.equals(id, other.id);
	}


=======
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getAuthority()))
				.collect(Collectors.toList());
	}

<<<<<<< HEAD

=======
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	@Override
	public String getUsername() {
		return email;
	}

<<<<<<< HEAD

=======
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

<<<<<<< HEAD

=======
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

<<<<<<< HEAD

=======
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

<<<<<<< HEAD

=======
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	@Override
	public boolean isEnabled() {
		return true;
	}
<<<<<<< HEAD
	
=======
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
}
