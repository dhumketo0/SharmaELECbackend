package com.SharmaELECbackend.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Product {
    @Id
    private long id;
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean available;
    private String imageUrl;
    //private List<String> additionalImageUrls;
    private int stockLevel;
    private int lowStockThreshold;
    private String brand;
    private String model;
    private Map<String, String> specifications;
    private List<String> features;
    private Date createdAt;
    private Date updatedAt;

}