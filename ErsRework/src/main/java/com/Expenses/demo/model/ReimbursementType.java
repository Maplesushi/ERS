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
@Table(name = "reimbursement_types")
public class ReimbursementType {
	

	@Id
	@Column(name = "typeId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reimbursementTypeId;
	
	@Column(name = "type")
	private String reimbursementType;

	public ReimbursementType(int i, String string) {
		this.reimbursementType = string;
	}
}
