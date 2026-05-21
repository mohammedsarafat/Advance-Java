package com.nit.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private long mob;
	
	@OneToOne
	private PanCard card;
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getaddress() {
		return address;
	}
	public long getMob() {
		return mob;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	
	public PanCard getCard() {
		return card;
	}
	public void setCard(PanCard card) {
		this.card = card;
	}
	
	@Override
	public String toString() {
		return "Person2 [id=" + id + ", name=" + name + ", address=" + address + ", mob=" + mob + "]";
	}
		
}
