package com.moderneinstein.web.vertx.Services ; 

import  io.vertx.core.Future ; 
import io.vertx.core.Promise ; 
import io.vertx.core.Handler ;
import io.vertx.core.AsyncResult ;  


public class PollServices{

    public Vertx initial  ;  
    public HashingStrategy hashing ; 
    public PollRepository  repository  ; 


    public PollServices(Vertx context ){
        hashing = HashingStrategy.load() ; 
        repository = new PollRepository(initial) ;  
         
    }  

    public Future<Poll> createPoll(String title, 
    Set<String> userId){

    } 
    public Future<Poll> determinePoll(String identity){

    } 
    

}