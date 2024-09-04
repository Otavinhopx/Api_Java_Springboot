package com.hoteis.hoteis.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "hotel_table")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "hotel_name", length = 100, nullable = false)
    private String name;
    @Column(name = "city_name", length = 100, nullable = false)
    private String city;
    @Column(name = "state_name", length = 100, nullable = false)
    private String state;
    @Column(name = "hotel_diary", length = 100, nullable = false)
    private Double diary;
    @Column(name = "hotel_stars", length = 100, nullable = false)
    private Double stars;

   
}
