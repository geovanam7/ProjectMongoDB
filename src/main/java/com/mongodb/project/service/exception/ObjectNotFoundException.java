package com.mongodb.project.service.exception;

public class ObjectNotFoundException  extends RuntimeException{
    public ObjectNotFoundException (String msg){
        super(msg);
    }
}
