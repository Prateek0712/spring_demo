package com.spring.firrst_apis;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.*;

@Repository
public class RepositoryLayer {
    HashMap<Integer,User>db=new HashMap<>();
    public String addToDb(User u)
    {
        int dbKey=u.id;
        db.put(dbKey,u);
        return "User added Succefully";
    }
    public User getById(int  key)
    {
        return db.get(key);
    }

    public List<User> getAlluser()
    {
        List<User>userList=new ArrayList<>();
        for(int key:db.keySet())
        {
            userList.add(db.get(key));
        }
        return userList;
    }


}
