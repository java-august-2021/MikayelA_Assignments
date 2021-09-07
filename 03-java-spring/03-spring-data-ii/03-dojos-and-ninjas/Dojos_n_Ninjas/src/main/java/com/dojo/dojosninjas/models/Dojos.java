package com.dojo.dojosninjas.models;

import java.util.Date;			
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table (name="dojos")

public class Dojos {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String name;
	
	@Column(updatable=false)
	private Date createdD;
	private Date updatedD;
	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="dojo", fetch=FetchType.LAZY)
	private List<Ninjas> ninjas;
	
    @PrePersist
    protected void onCreate(){
        this.createdD = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedD = new Date();
    }
    
	public Dojos() {

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public List<Ninjas> getNinjas() {
		return ninjas;
	}
	public void setNinjas(List<Ninjas> ninjas) {
		this.ninjas = ninjas;
	}
	
	
}
