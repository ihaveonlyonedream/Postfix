//Universidad del Valle de Guatemala
//Erick Saucedo 13167
//Kimberly Guzman 13642
//Luis Gomez 13135


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       
        Pila operandos = new Pila();
        int resultado = 0;
        int operando1 = 0;
        int operando2 = 0;
        
        try{
            //Se abre el archivo Datos.txt y se lee linea por linea. 
            FileInputStream archivo = new FileInputStream("C:\\Users\\Luis\\Desktop\\Java\\postfix\\Postfix\\Hoja de Trabajo No.2\\src\\Datos.txt");
            DataInputStream entrada = new DataInputStream(archivo);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String linea;
            
            while ((linea = buffer.readLine()) != null)   {
                
                //Se eliminan los espacios del string y se agregan a un arreglo de strings.
                String[] lineaArray = linea.split(" ");
                
                for (int i = 0; i < lineaArray.length; i++) {
                    
                    try{
                        
                        operandos.push(Integer.parseInt(lineaArray[i]));
                        
                    }catch(Exception e){
                        
                        if(lineaArray[i].equals("+")){
                            
                            operando1 = (int) operandos.pop();
                            if ((operandos.peek())!= null){
                                operando2 = (int)operandos.pop();
                            }else{
                                operando2= resultado;
                            }
                            resultado = operando2 + operando1;
                            System.out.println( operando2 + " + " + operando1);
                            System.out.println (resultado);
                        }
                        
                        if(lineaArray[i].equals("-")){
                             operando1 = (int) operandos.pop();
                            if ((operandos.peek())!= null){
                                operando2 = (int)operandos.pop();
                            }else{
                                operando2= resultado;
                            }
                            resultado = operando2 - operando1;
                            System.out.println( operando2 + " - " + operando1);
                            System.out.println (resultado);
                        }
                        
                        if(lineaArray[i].equals("*")){
                        
                             operando1 = (int) operandos.pop();
                            if ((operandos.peek())!= null){
                                operando2 = (int)operandos.pop();
                            }else{
                                operando2= resultado;
                            }
                            resultado = operando2 * operando1;
                            System.out.println( operando2 + " * " + operando1);
                            System.out.println (resultado);
                        }
                        
                        if(lineaArray[i].equals("/")){
                        
                            operando1 = (int) operandos.pop();
                            if ((operandos.peek())!= null){
                                operando2 = (int)operandos.pop();
                            }else{
                                operando2= resultado;
                            }
                            resultado = operando2 / operando1;
                            System.out.println( operando2 + " / " + operando1);
                            System.out.println (resultado);
                        }
                        
                        
                    }
                    
                    
                    
                }
            }
            entrada.close();
        }catch (Exception e){ 
            System.err.println("Archivo no encontrado");
        }
       
    }
}
