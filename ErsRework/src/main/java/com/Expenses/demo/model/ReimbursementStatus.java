package com.Expenses.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "reimbursement_status")
public class ReimbursementStatus {
	

	@Id
	@Column(name = "status_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusId;
	
	@Column(name = "status")
	private String status;
	
	public ReimbursementStatus(int i, String string) {
		this.status = string;
	}
}
