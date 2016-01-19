package me.wonwoo.account;

import org.springframework.data.rest.core.config.Projection;

/**
 * Created by wonwoo on 16. 1. 18..
 */

@Projection(name = "passwords", types = { Account.class })
public interface PasswordProjection {

    String getPassword();
}