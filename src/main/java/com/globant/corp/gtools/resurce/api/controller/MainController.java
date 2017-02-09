package com.globant.corp.gtools.resurce.api.controller;

import com.globant.corp.gtools.resurce.api.entity.Message;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ramiro.acoglanis
 */
@RestController
public class MainController {
    
    
    @GetMapping("/hello")
    @CrossOrigin(origins="*", maxAge=3600, allowedHeaders={"X-Auth-Token", "X-Requested-With"})
    public Message getMessege() {
            return new Message("Hola Mundoooooo");
    }
    
}
