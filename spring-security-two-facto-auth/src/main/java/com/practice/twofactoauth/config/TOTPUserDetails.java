package com.practice.twofactoauth.config;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class TOTPUserDetails implements UserDetails {
	private String username;
	private String password;
	private boolean enabled;
	private String secret;
	private Collection authorities = new HashSet<>();

	// public TOTPUserDetails(DBUser user) {
	public TOTPUserDetails() {
		/*
		 * this.username = user.getUsername(); this.password = user.getPassword();
		 * this.enabled = user.isEnabled(); this.secret = user.getSecret();
		 * populateAuthorities(user.getRoles());
		 */
		this.username = "akshay";
		this.password = "password";
		this.enabled = true;
		this.secret = "6YFX5HZT76OHHNMS";
		// populateAuthorities(user.getRoles());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}