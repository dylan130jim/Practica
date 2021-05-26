
package com.mycompany.constructores;


public class Constructor {
    private int numero, inicio, fin, peso, contvocales,a,b,c,d,e;
    private double estatura;
    private String nombre, apellido;
    public Constructor (){
        System.out.println("Llamando al metodo sin parametro");
    }
    public Constructor (int n){
        numero = n;
    }
    public Constructor (int inicio, int fin){
        this.inicio = inicio;
        this.fin = fin;
        
    }
    public Constructor (double est , int peso){
        estatura = est;
        this.peso = peso;
    }
    public Constructor (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //constructor copia
    public Constructor (Constructor obj){
        nombre = obj.nombre;
        apellido = obj.apellido;
    }
    
    public void sacarFactorial(){
        System.out.println("Sacar el factorial");
        System.out.println("");
    }
    public void sacarFactorial(int n){
        System.out.println("Sacamdo factorial de n");
        System.out.println("");
    }
    
    public void fibonaci(int n){
        a = 1;
        b = 2;
        System.out.println("Fubonaci con parametros |1,3|");
        System.out.println("El valor fibonaci es");
        for(int i=0;i<n;i++){
            c= a+b;
            d= b+c;
            e= c+d;
        }
        System.out.println("El valor de fibonaci 1 es " +a);
        System.out.println("El valor de fibonaci 2 es " +b);
        System.out.println("El valor de fibonaci 3 es " +c);
        System.out.println("El valor de fibonaci 4 es " +d);
        System.out.println("El valor de fibonaci 5 es " +e);
        System.out.println("");
    }
    
    public void masaCorporal(){
        System.out.println("Sacando masa coorporal de una persona");
        System.out.println("");
    }
    public void buscarLetra(){
        int contvocales = 0;
        char [] nombreaux = new char[nombre.length()];
        nombreaux = nombre.toCharArray();
        for(int i=0; i<nombre.length();i++){
            if(nombreaux[i]=='a'||nombreaux[i]=='e'||nombreaux[i]=='i'||nombreaux[i]=='o'||nombreaux[i]=='u'){
                contvocales++;
            }
        }
        System.out.println("Buscar el numero de vocales que tiene una cadena");
        System.out.println(nombre+" tiene "+contvocales+" vocales ");
        System.out.println("");
    }
    public void mensaje(){
        System.out.println("Buenas noches estamos aprendiendo constructor");
    }
}
