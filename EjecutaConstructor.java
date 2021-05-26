
package com.mycompany.constructores;


public class EjecutaConstructor {
    public static void main (String [] args){
        Constructor ob1 = new Constructor();
        Constructor ob2 = new Constructor(5);
        Constructor ob3 = new Constructor(2,5);
        Constructor ob4 = new Constructor(1.14,100);
        Constructor ob5 = new Constructor("aeropuerto","Jimenez");
        Constructor ob6 = new Constructor(ob5);
        
        //llamar a los mensajes
        ob1.mensaje();
        ob2.sacarFactorial();
        ob3.fibonaci(5);
        ob4.masaCorporal();
        ob5.buscarLetra();
        ob6.buscarLetra();
       
    }
        
    
}
