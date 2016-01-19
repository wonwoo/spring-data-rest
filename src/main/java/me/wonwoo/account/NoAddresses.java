package me.wonwoo.account;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

/**
 * Created by wonwoo on 16. 1. 18..
 */
@Projection(name = "noAddresses", types = { Account.class })
public interface NoAddresses {

    String getName();

    String getEmail();

    String getPassword();

    Date getJoined();

    Date getUpdated();
}