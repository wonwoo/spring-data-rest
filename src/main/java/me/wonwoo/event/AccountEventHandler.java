package me.wonwoo.event;

import lombok.extern.slf4j.Slf4j;
import me.wonwoo.account.Account;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

/**
 * Created by wonwoo on 16. 1. 19..
 */
//@Component
@RepositoryEventHandler(Account.class)
@Slf4j
public class AccountEventHandler {

    /**
     * save
     * @param account
     */
    @HandleBeforeCreate
    public void handleBeforeCreates(Account account) {
        account.setName("HandleBeforeCreate name");
        log.info("{}", account);
    }

    /**
     * update
     * @param account
     */

    @HandleBeforeSave
    public void handleBeforeSave(Account account) {
        log.info("{}", account);
        account.setName("HandleBeforeSave name");
    }
}
