package com.nit.dto;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mid;

    private String m_name;
    private String color;

    @OneToMany()
    private List<SimCard> simCards;

    public int getMid() {
        return mid;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<SimCard> getSimCards() {
        return simCards;
    }

    public void setSimCards(List<SimCard> simCards) {
        this.simCards = simCards;
    }
}
