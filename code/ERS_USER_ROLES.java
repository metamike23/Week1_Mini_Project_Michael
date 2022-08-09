package com.revature.code;

import java.util.Objects;

public abstract class ERS_USER_ROLES {
	
	int ERS_USERS_ROLE_ID;
	char USER_ROLE;
	
	public abstract void ERS_USER_ROLES_PK(int ERS_USER_ROLES_ID);

	public ERS_USER_ROLES() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ERS_USER_ROLES(int eRS_USERS_ROLE_ID, char uSER_ROLE) {
		super();
		ERS_USERS_ROLE_ID = eRS_USERS_ROLE_ID;
		USER_ROLE = uSER_ROLE;
	}

	@Override
	public String toString() {
		return "ERS_USER_ROLES [ERS_USERS_ROLE_ID=" + ERS_USERS_ROLE_ID + ", USER_ROLE=" + USER_ROLE + "]";
	}

	public int getERS_USERS_ROLE_ID() {
		return ERS_USERS_ROLE_ID;
	}

	public void setERS_USERS_ROLE_ID(int eRS_USERS_ROLE_ID) {
		ERS_USERS_ROLE_ID = eRS_USERS_ROLE_ID;
	}

	public char getUSER_ROLE() {
		return USER_ROLE;
	}

	public void setUSER_ROLE(char uSER_ROLE) {
		USER_ROLE = uSER_ROLE;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ERS_USERS_ROLE_ID, USER_ROLE);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ERS_USER_ROLES other = (ERS_USER_ROLES) obj;
		return ERS_USERS_ROLE_ID == other.ERS_USERS_ROLE_ID && USER_ROLE == other.USER_ROLE;
	}
	
	
}
