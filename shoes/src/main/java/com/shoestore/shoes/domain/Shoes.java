package com.shoestore.shoes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Shoes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Idshoes;
    private String name;
    private String mark;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name="enablesize_id")
    private Sizes enablesizeId;
    @ManyToOne
    @JoinColumn(name="photo_id")
    private Photo photoId;
    @ManyToOne
    @JoinColumn(name="color_id")
    private Color colorId;
    private double price;
    private String  sexshoes;

    public int getIdshoes() {
        return Idshoes;
    }

    public void setIdshoes(int Idshoes) {
        this.Idshoes = Idshoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Sizes getEnablesizeId() {
        return enablesizeId;
    }

    public void setEnablesizeId(Sizes enablesizeId) {
        this.enablesizeId = enablesizeId;
    }

    public Photo getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Photo photoId) {
        this.photoId = photoId;
    }

    public Color getColorId() {
        return colorId;
    }

    public void setColorId(Color colorId) {
        this.colorId = colorId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSexshoes() {
        return sexshoes;
    }

    public void setSexshoes(String sexshoes) {
        this.sexshoes = sexshoes;
    }
}
