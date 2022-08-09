package com.revature.code;

import java.util.Objects;

public abstract class ERS_REIMBURSEMENT {
	
	int REIMB_ID;
	int REIMB_AMOUNT;
	char REIMB_SUBMITTED;
	char REIMB_RESOLVED;
	char REIMB_DESCRIPTION;
	char REIMB_RECEIPT;
	int REIMB_AUTHOR;
	int REIMB_RESOLVER;
	int REIMB_STATUS_ID;
	int REIMB_TYPE_ID;
	
	public abstract void ERS_REIMBURSEMENT_PK(int REIMB_ID);
	
	//no args and all args constructors

	public ERS_REIMBURSEMENT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ERS_REIMBURSEMENT(int rEIMB_ID, int rEIMB_AMOUNT, char rEIMB_SUBMITTED, char rEIMB_RESOLVED,
			char rEIMB_DESCRIPTION, char rEIMB_RECEIPT, int rEIMB_AUTHOR, int rEIMB_RESOLVER, int rEIMB_STATUS_ID,
			int rEIMB_TYPE_ID) {
		super();
		REIMB_ID = rEIMB_ID;
		REIMB_AMOUNT = rEIMB_AMOUNT;
		REIMB_SUBMITTED = rEIMB_SUBMITTED;
		REIMB_RESOLVED = rEIMB_RESOLVED;
		REIMB_DESCRIPTION = rEIMB_DESCRIPTION;
		REIMB_RECEIPT = rEIMB_RECEIPT;
		REIMB_AUTHOR = rEIMB_AUTHOR;
		REIMB_RESOLVER = rEIMB_RESOLVER;
		REIMB_STATUS_ID = rEIMB_STATUS_ID;
		REIMB_TYPE_ID = rEIMB_TYPE_ID;
	}

	public int getREIMB_ID() {
		return REIMB_ID;
	}

	public void setREIMB_ID(int rEIMB_ID) {
		REIMB_ID = rEIMB_ID;
	}

	public int getREIMB_AMOUNT() {
		return REIMB_AMOUNT;
	}

	public void setREIMB_AMOUNT(int rEIMB_AMOUNT) {
		REIMB_AMOUNT = rEIMB_AMOUNT;
	}

	public char getREIMB_SUBMITTED() {
		return REIMB_SUBMITTED;
	}

	public void setREIMB_SUBMITTED(char rEIMB_SUBMITTED) {
		REIMB_SUBMITTED = rEIMB_SUBMITTED;
	}

	public char getREIMB_RESOLVED() {
		return REIMB_RESOLVED;
	}

	public void setREIMB_RESOLVED(char rEIMB_RESOLVED) {
		REIMB_RESOLVED = rEIMB_RESOLVED;
	}

	public char getREIMB_DESCRIPTION() {
		return REIMB_DESCRIPTION;
	}

	public void setREIMB_DESCRIPTION(char rEIMB_DESCRIPTION) {
		REIMB_DESCRIPTION = rEIMB_DESCRIPTION;
	}

	public char getREIMB_RECEIPT() {
		return REIMB_RECEIPT;
	}

	public void setREIMB_RECEIPT(char rEIMB_RECEIPT) {
		REIMB_RECEIPT = rEIMB_RECEIPT;
	}

	public int getREIMB_AUTHOR() {
		return REIMB_AUTHOR;
	}

	public void setREIMB_AUTHOR(int rEIMB_AUTHOR) {
		REIMB_AUTHOR = rEIMB_AUTHOR;
	}

	public int getREIMB_RESOLVER() {
		return REIMB_RESOLVER;
	}

	public void setREIMB_RESOLVER(int rEIMB_RESOLVER) {
		REIMB_RESOLVER = rEIMB_RESOLVER;
	}

	public int getREIMB_STATUS_ID() {
		return REIMB_STATUS_ID;
	}

	public void setREIMB_STATUS_ID(int rEIMB_STATUS_ID) {
		REIMB_STATUS_ID = rEIMB_STATUS_ID;
	}

	public int getREIMB_TYPE_ID() {
		return REIMB_TYPE_ID;
	}

	public void setREIMB_TYPE_ID(int rEIMB_TYPE_ID) {
		REIMB_TYPE_ID = rEIMB_TYPE_ID;
	}

	@Override
	public String toString() {
		return "ERS_REIMBURSEMENT [REIMB_ID=" + REIMB_ID + ", REIMB_AMOUNT=" + REIMB_AMOUNT + ", REIMB_SUBMITTED="
				+ REIMB_SUBMITTED + ", REIMB_RESOLVED=" + REIMB_RESOLVED + ", REIMB_DESCRIPTION=" + REIMB_DESCRIPTION
				+ ", REIMB_RECEIPT=" + REIMB_RECEIPT + ", REIMB_AUTHOR=" + REIMB_AUTHOR + ", REIMB_RESOLVER="
				+ REIMB_RESOLVER + ", REIMB_STATUS_ID=" + REIMB_STATUS_ID + ", REIMB_TYPE_ID=" + REIMB_TYPE_ID + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(REIMB_AMOUNT, REIMB_AUTHOR, REIMB_DESCRIPTION, REIMB_ID, REIMB_RECEIPT, REIMB_RESOLVED,
				REIMB_RESOLVER, REIMB_STATUS_ID, REIMB_SUBMITTED, REIMB_TYPE_ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ERS_REIMBURSEMENT other = (ERS_REIMBURSEMENT) obj;
		return REIMB_AMOUNT == other.REIMB_AMOUNT && REIMB_AUTHOR == other.REIMB_AUTHOR
				&& REIMB_DESCRIPTION == other.REIMB_DESCRIPTION && REIMB_ID == other.REIMB_ID
				&& REIMB_RECEIPT == other.REIMB_RECEIPT && REIMB_RESOLVED == other.REIMB_RESOLVED
				&& REIMB_RESOLVER == other.REIMB_RESOLVER && REIMB_STATUS_ID == other.REIMB_STATUS_ID
				&& REIMB_SUBMITTED == other.REIMB_SUBMITTED && REIMB_TYPE_ID == other.REIMB_TYPE_ID;
	}
	
	
	
	

}

