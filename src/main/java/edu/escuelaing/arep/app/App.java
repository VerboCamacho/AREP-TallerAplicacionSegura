package edu.escuelaing.arep.app;

import static spark.Spark.get;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){

        get("/helloservice",(req,res)->"Hello From Service");
        
    }



    /**
     * @return the port 4567
     */
    public static int getPort(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
