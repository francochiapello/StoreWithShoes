package com.shoestore.shoes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sizes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int range1;
    private int range2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRange1() {
        return range1;
    }

    public void setRange1(int range1) {
        this.range1 = range1;
    }

    public int getRange2() {
        return range2;
    }

    public void setRange2(int range2) {
        this.range2 = range2;
    }
    
    
}
