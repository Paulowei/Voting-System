package com.moderneinstein.web.vertx ; 

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future ; 
import io.vertx.core.Promise ; 
import io.vertx.core.Vertx ;   
import io.vertx.core.http.HttpServer ;  
import io.vertx.core.http.HttpServerOptions ; 
import java.util.Properties ; 
import java.util.Map ;  

public class CoreVerticle extends AbstractVerticle {

    @Override
    public void start() {

    }  

    @Override 
    public void start(Promise<Void> initial){
         vertx = vertx.vertx () ; 
        HttpServer server = vertx.createHttpServer(); 
        Router bundle = Router.router(vertx) ; 
        server.listen(8080,
        new Handler<AsyncResult<HttpServer>> (){
            @Override 
            public void handle (AsyncResult<HttpServer> pending){
                if(pending.succeeded()){
                HttpServer special = pending.result() ;   
                Void voided = null ;  
                initial.complete(voided) ; 
             }
            }
        }) ;
    }

}
