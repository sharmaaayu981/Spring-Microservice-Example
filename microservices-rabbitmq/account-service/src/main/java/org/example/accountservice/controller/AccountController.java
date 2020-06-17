package org.example.accountservice.controller;

import org.example.accountservice.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {
    private static List<Account> list;

    @PostConstruct
    public void init()
    {
        list=new ArrayList<Account>();
        list.add(new Account(1,"John",true));
        list.add(new Account(2,"Marry",true));
        list.add(new Account(3,"Don",true));
        list.add(new Account(4,"Sachin",false));
        list.add(new Account(5,"Warne",false));

    }

    @GetMapping("/accounts")
    public List<Account> getAccount()
    {
        return list;
    }
}
