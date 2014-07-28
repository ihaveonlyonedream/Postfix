//******************************************************************************************************************
//Universidad del Valle de Guatemala
//Autores:                  Erick Saucedo       13167
//                          Kimberly Guzmanm    13642
//                          Luis Gomez          13135
//
//Descripcion: Este programa es utilizado para generar una pila de datos donde se puede ingresar un valor,
//             sacar el ultimo de valor de pila y eliminarlo, mostrar el ultimo valor de la pila y saber si
//             la pila esta vacia.
//******************************************************************************************************************


import java.util.ArrayList;

public class Pila {
    
    //Se crea un arrayList de tipo objeto
    private ArrayList <Object> pila = new ArrayList();
    
    
    //******************************************************************************************************************
    //Ingreso de un valor a la pila
    public void push(Object o){
       pila.add(o);
    }
    
    //Egreso de un valor de la pila y luego lo elimina
    public Object pop(){
       if(!(pila.isEmpty())){
           Object o = pila.get(pila.size()-1);
           pila.remove(pila.size()-1);
           return o;
       }else{
           return null;
       }
    }
    
   //Muestra el ultimo valor ingresado a la pila
   public Object peek(){
          if(!(pila.isEmpty())){
           Object o = pila.get(pila.size()-1);
           return o;
       }else{
           return null;
       }    
   }
   
   //Verifica si la pila esta vacia o no
   public boolean empty(){
       return pila.isEmpty();
    }
   
   //******************************************************************************************************************
   
}
