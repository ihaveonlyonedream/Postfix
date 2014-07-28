//Universidad del Valle de Guatemala
//Erick Saucedo 13167
//Kimberly Guzmanm 13642
//Luis Gomez 13135



import java.util.ArrayList;

public class Pila {
    
    private ArrayList <Object> pila = new ArrayList();
    
    public void push(Object o){
       pila.add(o);
    }

    public Object pop(){
       if(!(pila.isEmpty())){
           Object o = pila.get(pila.size()-1);
           pila.remove(pila.size()-1);
           return o;
       }else{
           return null;
       }
    }

   public Object peek(){
          if(!(pila.isEmpty())){
           Object o = pila.get(pila.size()-1);
           return o;
       }else{
           return null;
       }    
   }

   public boolean empty(){
       return pila.isEmpty();
    }

}
