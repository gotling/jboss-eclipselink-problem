package se.magos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Account
 * 
 */
@Entity
@Table(name = "account_test")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private String accountName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Account() {
		super();
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountName=" + accountName + "]";
	}

}
