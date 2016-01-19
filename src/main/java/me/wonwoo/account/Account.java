package me.wonwoo.account;

import lombok.Data;
import me.wonwoo.address.Address;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by wonwoo on 16. 1. 18..
 */
@Entity
@Data
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "name is required")
    private String name;

    private String email;

    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @Temporal(TemporalType.TIMESTAMP)
    private Date joined;

    @PrePersist
    void perjoined() {
        joined = new Date();
    }

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;

    @PreUpdate
    void preUpdateed() {
        this.updated = new Date();
    }
}
