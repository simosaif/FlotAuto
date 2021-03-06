package net.sas.model.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.sas.model.enums.MeasureUnit;

@Entity
public class Cycle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(nullable=false)
	private Integer frequence;
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private MeasureUnit unit;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFrequence() {
		return frequence;
	}
	public void setFrequence(Integer frequence) {
		this.frequence = frequence;
	}
	public MeasureUnit getUnit() {
		return unit;
	}
	public void setUnit(MeasureUnit unit) {
		this.unit = unit;
	}	
}
