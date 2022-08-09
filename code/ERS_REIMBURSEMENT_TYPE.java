package com.revature.code;

import java.util.Objects;

public abstract class ERS_REIMBURSEMENT_TYPE {
	
	int REIMB_TYPE_ID;
	char REIMB_TYPE;
	
	public abstract void REIMB_TYPE_PK(int REIMB_TYPE_ID);

	public ERS_REIMBURSEMENT_TYPE() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ERS_REIMBURSEMENT_TYPE(int rEIMB_TYPE_ID, char rEIMB_TYPE) {
		super();
		REIMB_TYPE_ID = rEIMB_TYPE_ID;
		REIMB_TYPE = rEIMB_TYPE;
	}

	public int getREIMB_TYPE_ID() {
		return REIMB_TYPE_ID;
	}

	public void setREIMB_TYPE_ID(int rEIMB_TYPE_ID) {
		REIMB_TYPE_ID = rEIMB_TYPE_ID;
	}

	public char getREIMB_TYPE() {
		return REIMB_TYPE;
	}

	public void setREIMB_TYPE(char rEIMB_TYPE) {
		REIMB_TYPE = rEIMB_TYPE;
	}

	@Override
	public String toString() {
		return "ERS_REIMBURSEMENT_TYPE [REIMB_TYPE_ID=" + REIMB_TYPE_ID + ", REIMB_TYPE=" + REIMB_TYPE + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(REIMB_TYPE, REIMB_TYPE_ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ERS_REIMBURSEMENT_TYPE other = (ERS_REIMBURSEMENT_TYPE) obj;
		return REIMB_TYPE == other.REIMB_TYPE && REIMB_TYPE_ID == other.REIMB_TYPE_ID;
	}
	
	

}
