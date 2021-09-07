package com.dojo.dojosninjas.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table (name="ninjas")

public class Ninjas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String fName;
    private String lName;
    private int age;
    
	@Column(updatable=false)
	private Date createdD;
	private Date updatedD;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dojo_id")
	private Dojos dojo;
	
	
    
    @PrePersist
    protected void onCreate(){
        this.createdD = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedD = new Date();
    }
    
	
	public Ninjas() {

	}	
   
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getCreatedD() {
		return createdD;
	}
	public void setCreatedD(Date createdD) {
		this.createdD = createdD;
	}
	public Date getUpdatedD() {
		return updatedD;
	}
	public void setUpdatedD(Date updatedD) {
		this.updatedD = updatedD;
	}
	public Dojos getDojo() {
		return dojo;
	}
	public void setDojo(Dojos dojo) {
		this.dojo = dojo;
	}
	
    
    
}
