package com.miproyectoyoprogramo.portfoliowebsite.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Education implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id; /*id is primary key. Can't be null or updated once in the table.*/
    private String name; /*name is the name of the School or Program, if applicable.*/
    private String description; /*description of the course, timeframe I studied there, etc.*/
    private String imageURL; /*URL of the image asset for the particular school or program.*/
}