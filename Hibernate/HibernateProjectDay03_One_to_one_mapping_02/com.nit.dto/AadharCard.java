package com.nit.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AadharCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String ch_name;
	private long c_number;
	public int getPid() {
		return aid;
	}
	public void setPid(int pid) {
		this.aid = pid;
	}
	public String getCh_name() {
		return ch_name;
	}
	public void setCh_name(String ch_name) {
		this.ch_name = ch_name;
	}
	public long getC_number() {
		return c_number;
	}
	public void setC_number(long c_number) {
		this.c_number = c_number;
	}
	@Override
	public String toString() {
		return "PanCard [aid=" + aid + ", ch_name=" + ch_name + ", c_number=" + c_number + "]";
	}		
}
