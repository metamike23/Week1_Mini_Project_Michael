package com.revature.code;

import java.util.Objects;

public abstract class ERS_USERS {
	//Define the variables in the ERS_USERS class
		long ERS_USERS_ID;
		char ERS_USERNAME;
		char ERS_PASSWORD;
		char USER_FIRST_NAME;
		char USER_LAST_NAME;
		char USER_EMAILS;
		double USER_ROLE_ID;
		
		//Define the methods of the ERS_USERS class
		public abstract void ERS_USERS_PK(long ERS_USERS_ID);

		public abstract void ERS_USERS_UNv1(char ERS_USERNAME, char USER_EMAIL);
		
		public abstract void USER_ROLES_FK(double USER_ROLE_ID);

		
		//Generate a no args and an all args constructor
		public ERS_USERS() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ERS_USERS(long eRS_USERS_ID, char eRS_USERNAME, char eRS_PASSWORD, char uSER_FIRST_NAME, char uSER_LAST_NAME,
				char uSER_EMAILS, double uSER_ROLE_ID) {
			super();
			ERS_USERS_ID = eRS_USERS_ID;
			ERS_USERNAME = eRS_USERNAME;
			ERS_PASSWORD = eRS_PASSWORD;
			USER_FIRST_NAME = uSER_FIRST_NAME;
			USER_LAST_NAME = uSER_LAST_NAME;
			USER_EMAILS = uSER_EMAILS;
			USER_ROLE_ID = uSER_ROLE_ID;
		}
		
		//Getters and Setters

		public long getERS_USERS_ID() {
			return ERS_USERS_ID;
		}

		public void setERS_USERS_ID(long eRS_USERS_ID) {
			ERS_USERS_ID = eRS_USERS_ID;
		}

		public char getERS_USERNAME() {
			return ERS_USERNAME;
		}

		public void setERS_USERNAME(char eRS_USERNAME) {
			ERS_USERNAME = eRS_USERNAME;
		}

		public char getERS_PASSWORD() {
			return ERS_PASSWORD;
		}

		public void setERS_PASSWORD(char eRS_PASSWORD) {
			ERS_PASSWORD = eRS_PASSWORD;
		}

		public char getUSER_FIRST_NAME() {
			return USER_FIRST_NAME;
		}

		public void setUSER_FIRST_NAME(char uSER_FIRST_NAME) {
			USER_FIRST_NAME = uSER_FIRST_NAME;
		}

		public char getUSER_LAST_NAME() {
			return USER_LAST_NAME;
		}

		public void setUSER_LAST_NAME(char uSER_LAST_NAME) {
			USER_LAST_NAME = uSER_LAST_NAME;
		}

		public char getUSER_EMAILS() {
			return USER_EMAILS;
		}

		public void setUSER_EMAILS(char uSER_EMAILS) {
			USER_EMAILS = uSER_EMAILS;
		}

		public double getUSER_ROLE_ID() {
			return USER_ROLE_ID;
		}

		public void setUSER_ROLE_ID(double uSER_ROLE_ID) {
			USER_ROLE_ID = uSER_ROLE_ID;
		}
		
		//Generate the toString method

		@Override
		public String toString() {
			return "ERS_USERS [ERS_USERS_ID=" + ERS_USERS_ID + ", ERS_USERNAME=" + ERS_USERNAME + ", ERS_PASSWORD="
					+ ERS_PASSWORD + ", USER_FIRST_NAME=" + USER_FIRST_NAME + ", USER_LAST_NAME=" + USER_LAST_NAME
					+ ", USER_EMAILS=" + USER_EMAILS + ", USER_ROLE_ID=" + USER_ROLE_ID + "]";
		}
		
		//Generate hashcode

		@Override
		public int hashCode() {
			return Objects.hash(ERS_PASSWORD, ERS_USERNAME, ERS_USERS_ID, USER_EMAILS, USER_FIRST_NAME, USER_LAST_NAME,
					USER_ROLE_ID);
		}
		
		
	    //Generate equals
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ERS_USERS other = (ERS_USERS) obj;
			return ERS_PASSWORD == other.ERS_PASSWORD && ERS_USERNAME == other.ERS_USERNAME
					&& ERS_USERS_ID == other.ERS_USERS_ID && USER_EMAILS == other.USER_EMAILS
					&& USER_FIRST_NAME == other.USER_FIRST_NAME && USER_LAST_NAME == other.USER_LAST_NAME
					&& Double.doubleToLongBits(USER_ROLE_ID) == Double.doubleToLongBits(other.USER_ROLE_ID);
		}
}
