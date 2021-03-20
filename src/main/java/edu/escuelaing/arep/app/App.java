package edu.escuelaing.arep.app;

import static spark.Spark.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){
        secure("keysCerts/ecikeystore.p12", "123456", null, null);
        port(getPort());
        get("/helloSecureService",(req,res)->"Hello From Service");
        
    }



    /**
     * @return the port 4567
     */
    public static int getPort(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}
