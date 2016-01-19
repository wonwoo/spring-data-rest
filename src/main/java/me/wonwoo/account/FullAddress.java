package me.wonwoo.account;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

/**
 * Created by wonwoo on 16. 1. 19..
 */
@Projection(name = "fullAddress", types = { Account.class })
public interface FullAddress {

    @Value("#{target.address.street} #{target.address.state} #{target.address.country}")
    String getFullAddress();

    String getName();

    String getEmail();

    String getPassword();

    Date getJoined();

    Date getUpdated();

}
