package cl.camelsoft.java11capabilities.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.camelsoft.java11capabilities.beans.Client;

@RestController
@RequestMapping("/api")
public class RestSevices {

    @RequestMapping(path = "/client" , method = {RequestMethod.GET}, produces = {"application/json"})
    public Client getClient(@RequestParam("id") long id){
        Client c=new Client();
        
        c.setId(123456L);
        c.setName("name");
        
        return c;
            
    }
    
}