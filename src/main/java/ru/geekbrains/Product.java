package ru.geekbrains;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "cost")
    private Long cost;

    @Column(name = "count")
    private Integer count;

    public Product() {
    }

    public Product(String title, Long cost) {
        this.title = title;
        this.cost = cost;
    }

    public Product(String title, Long cost, Integer count) {
        this.title = title;
        this.cost = cost;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title +
                ", cost=" + cost +
                ", count=" + count +
                '}';
    }
}
