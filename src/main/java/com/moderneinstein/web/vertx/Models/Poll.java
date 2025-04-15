package com.moderneinstein.web.vertx.Models ;  


public class Poll{

    private String identity  ;  
    private Map<String,Map<String,Integer>> links ;  
    private Set<String> candidates  ; 

    public Poll(String initial){
        identity = initial ;  
        links = new HashMap<String,Map<String,Integer>>() ; 
        candidtes= new TreeMap<String>() ;  
    }    

    public void validate(){

    }  
    public boolean includeCandidate(String initial){  
        if(candidates.contains (initial)){
            return false ; 
        } else{
        candidates.add(initial) ; 
        return true ;   } 
    }  
    public void includeVote(String candidateId ,String factionId){
       // if(!links.containsKey(candidateId)){ }
            links.putIfAbsent(candidateId,new TreeMap<String,Integer>())
        Map<String,Integer> previous = links.get(candidateId) ;  
        if(!links) 
        
    }
}