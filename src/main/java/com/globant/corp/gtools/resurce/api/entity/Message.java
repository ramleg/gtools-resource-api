package com.globant.corp.gtools.resurce.api.entity;

import java.util.UUID;

/**
 *
 * @author ramiro.acoglanis
 */
public class Message {
    
    private String id;
    private String desc;

    public Message(String desc) {
        this.id = UUID.randomUUID().toString();
        this.desc = desc;
    }

    public String getId(){
        return id;
    }
    
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
    
}
