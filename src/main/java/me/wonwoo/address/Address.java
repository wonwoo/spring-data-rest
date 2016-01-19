package me.wonwoo.address;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by wonwoo on 16. 1. 18..
 */
@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String street;

    private String state;

    private String country;
}