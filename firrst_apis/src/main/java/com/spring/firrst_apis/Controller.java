package com.spring.firrst_apis;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private ServiceLayer Slobj;

    //api's by request paramenter
    @PostMapping ("/addtoData")
    public ResponseEntity<String> addToData(@RequestParam("userId")int uid,@RequestParam("userName")String name, @RequestParam("userAge")int age)
    {
        String result= Slobj.addToUser(uid,name,age);
        return new ResponseEntity<>(result,HttpStatus.OK);
    }

    @GetMapping("/getFromData")
    public ResponseEntity<User> getFromData(@RequestParam("userId")Integer uid)
    {
        User u=Slobj.getFromData(uid);
        return new ResponseEntity<>(u,HttpStatus.OK);
    }
    HashMap<Integer,User>mp=new HashMap<>();
    /*@GetMapping ("/addtoData")
    public String addToData(@RequestParam("userId")Integer uid,
                          @RequestParam("userName")String name,
                          @RequestParam("userAge")Integer age)
    {
        User u=new User(uid,name,age);
        mp.put(uid,u);
        return "Seccuss";
    }*/
}
