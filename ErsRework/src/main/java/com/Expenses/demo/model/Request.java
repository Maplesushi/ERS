package com.Expenses.demo.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "request_table")
public class Request {
	

	@Id
	@Column(name = "request_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reimbId;
	
	@Column(name = "author", nullable = false)
	private int reimbAuthor;
	
	@Column(name = "amount", nullable = false)
	private float reimbAmt;
	
	@Column(name = "date_submitted", nullable = false)
	private String reimbSumbitted;
	
	@Column(name = "date_resolved")
	private String reimbResolved;
	
	@Column(name = "description", nullable = false)
	private String reimbDescription;
	
	@Column(name = "resolver")
	private int resolvedBy;
	
	@Column(name = "type", nullable = false)
	private int requestType;
	
	@Column(name = "status", nullable = false)
	private int requestStatus;
	
	public Request(int i, int j, float f, String string, String string2, String string3, int k, int l, int m) {
		this.reimbAuthor = j;
		this.reimbAmt = f;
		this.reimbSumbitted = string;
		this.reimbResolved = string2;
		this.reimbDescription = string3;
		this.resolvedBy = k;
		this.requestType = l;
		this.requestStatus = m;
	}
}
