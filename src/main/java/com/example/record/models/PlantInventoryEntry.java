package com.example.record.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class PlantInventoryEntry {
    @Id
    @GeneratedValue
    Long id;

    String name;
    String description;
    @Column(precision=8, scale=2)
    BigDecimal price;
}