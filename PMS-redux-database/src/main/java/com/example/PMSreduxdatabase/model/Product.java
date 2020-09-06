package com.example.PMSreduxdatabase.model;


import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(unique = true)
    private String product_id;

    @Column(unique = true)
    private String product_name;

    @Column(unique = true)
    private String product_code;

    @Column
    private String release_date;

    @Column
    private String description;

    @Column
    private Float price;

    @Column
    private Float star_rating;

    @Column(unique = true)
    private String imgUrl;

    public Product() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getStar_rating() {
        return star_rating;
    }

    public void setStar_rating(Float star_rating) {
        this.star_rating = star_rating;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
