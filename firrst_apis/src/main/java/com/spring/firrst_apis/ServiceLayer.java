package com.spring.firrst_apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {
    @Autowired
    private RepositoryLayer repoObj;

    public String addToUser(int id,String name,int age)
    {
        User u=new User(id,name,age);
        String result=repoObj.addToDb(u);
        return result;
    }
    public User getFromData(int uid)
    {
        return repoObj.getById(uid);
    }
}
