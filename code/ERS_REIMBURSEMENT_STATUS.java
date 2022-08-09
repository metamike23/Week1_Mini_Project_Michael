package com.revature.code;

import java.util.Objects;

public abstract class ERS_REIMBURSEMENT_STATUS {
	
	int REIMB_STATUS_ID;
	char REIMB_STATUS;
	
	public abstract void REIMB_STATUS_PK(int REIMB_STATUS_ID);

	public ERS_REIMBURSEMENT_STATUS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ERS_REIMBURSEMENT_STATUS(int rEIMB_STATUS_ID, char rEIMB_STATUS) {
		super();
		REIMB_STATUS_ID = rEIMB_STATUS_ID;
		REIMB_STATUS = rEIMB_STATUS;
	}

	public int getREIMB_STATUS_ID() {
		return REIMB_STATUS_ID;
	}

	public void setREIMB_STATUS_ID(int rEIMB_STATUS_ID) {
		REIMB_STATUS_ID = rEIMB_STATUS_ID;
	}

	public char getREIMB_STATUS() {
		return REIMB_STATUS;
	}

	public void setREIMB_STATUS(char rEIMB_STATUS) {
		REIMB_STATUS = rEIMB_STATUS;
	}

	@Override
	public String toString() {
		return "ERS_REIMBURSEMENT_STATUS [REIMB_STATUS_ID=" + REIMB_STATUS_ID + ", REIMB_STATUS=" + REIMB_STATUS + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(REIMB_STATUS, REIMB_STATUS_ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ERS_REIMBURSEMENT_STATUS other = (ERS_REIMBURSEMENT_STATUS) obj;
		return REIMB_STATUS == other.REIMB_STATUS && REIMB_STATUS_ID == other.REIMB_STATUS_ID;
	}
	
	

}