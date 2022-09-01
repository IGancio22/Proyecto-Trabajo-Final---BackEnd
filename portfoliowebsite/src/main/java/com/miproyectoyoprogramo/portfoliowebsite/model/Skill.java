package com.miproyectoyoprogramo.portfoliowebsite.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Skill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id; /*id is primary key. Can't be null or updated once in the table.*/
    private String name; /*name is the name of the Skill.*/
    private String altName; /*altName is a shortened form of the name of the Skill.*/
    private Short val; /*Numerical value representing advancement/mastery of the Skill.*/
}