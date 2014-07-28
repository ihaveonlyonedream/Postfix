//******************************************************************************************************************
//Universidad del Valle de Guatemala
//Autores:                  Erick Saucedo       13167
//                          Kimberly Guzmanm    13642
//                          Luis Gomez          13135
//
//Descripcion: Este programa lee un documento de texto llamado Datos.txt donde se encuentra una operacion en
//             postfix, luego de leer el documento realiza la operacion en infix y despliega el resultado.
//******************************************************************************************************************

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
//******************************************************************************************************************

public class Main {

    public static void main(String[] args) {
       
        //******************************************************************************************************************
        
        //Variables a utilizar
        Pila operandos = new Pila();
        int resultado = 0;
        int operando1 = 0;
        int operando2 = 0;
        
        
        //******************************************************************************************************************
        
        //Lectura del documento Datos.txt
        try{
            //Se abre el archivo Datos.txt y se lee linea por linea. 
            FileInputStream archivo = new FileInputStream("C:\\Users\\Luis\\Desktop\\Java\\postfix\\Postfix\\Hoja de Trabajo No.2\\src\\Datos.txt");
            DataInputStream entrada = new DataInputStream(archivo);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String linea;
            
        //******************************************************************************************************************    
            
            //Se lee linea por linea
            while ((linea = buffer.readLine()) != null)   {
                
                //Se reinician las variables de las operaciones por si existe mas de una linea de operaciones
                resultado=0;
                operando1=0;
                operando2=0;
                
                //Se eliminan los espacios del string y se agregan a un arreglo de strings.
                String[] lineaArray = linea.split(" ");
        //******************************************************************************************************************
                
                //Se recorre el array con los numeros utilizados
                for (int i = 0; i < lineaArray.length; i++) {
                    
                    //Se verifica si el caracter es un numero o un operador
                    try{
                        //Si es un numero se guarda en la pila
                        operandos.push(Integer.parseInt(lineaArray[i]));
                        
                    }catch(Exception e){                                        //Si no se puede convertir en número se verifica que tipo de operador es
        //******************************************************************************************************************
                        
                        //SUMA
                        if(lineaArray[i].equals("+")){
                            
                            operando1 = (int) operandos.pop();
                            //Verifica si en la pila existe otro numero para operar, de lo contrario tomara el resultado como segundo operando.                            
                            if ((operandos.peek())!= null){
                                operando2 = (int)operandos.pop();
                            }else{
                                operando2= resultado;
                            }
                            
                            //Realiza la operacion
                            resultado = operando2 + operando1;
                            
                        }
        //******************************************************************************************************************                
                        //RESTA
                        
                        if(lineaArray[i].equals("-")){
                            
                             operando1 = (int) operandos.pop();
                            
                             //Verifica si en la pila existe otro numero para operar, de lo contrario tomara el resultado como segundo operando.                            
                            if ((operandos.peek())!= null){
                                operando2 = (int)operandos.pop();
                            }else{
                                operando2= resultado;
                            }
                            
                            //Realiza la operacion
                            resultado = operando2 - operando1;
                            
                        }
        //******************************************************************************************************************                
                        //MULTIPLICACION
                        
                        if(lineaArray[i].equals("*")){
                        
                             operando1 = (int) operandos.pop();
                             
                            //Verifica si en la pila existe otro numero para operar, de lo contrario tomara el resultado como segundo operando.                             
                            if ((operandos.peek())!= null){
                                operando2 = (int)operandos.pop();
                            }else{
                                operando2= resultado;
                            }
                            
                            //Realiza la operacion
                            resultado = operando2 * operando1;
                            
                        }
        //******************************************************************************************************************                
                        //DIVISION
                        
                        if(lineaArray[i].equals("/")){
                        
                            operando1 = (int) operandos.pop();
                            
                            //Verifica si en la pila existe otro numero para operar, de lo contrario tomara el resultado como segundo operando.                            
                            if ((operandos.peek())!= null){
                                operando2 = (int)operandos.pop();
                            }else{
                                operando2= resultado;
                            }
                            
                            //Realiza la operacion
                            resultado = operando2 / operando1;
                            
                        }
                        
        //******************************************************************************************************************                
                    }
                    
                    
                    
                }
        //******************************************************************************************************************        
                //Muestra el resultado
                System.out.println("El resultado es: " + resultado);
        //******************************************************************************************************************
            }
            entrada.close();
            
            
        }catch (Exception e){ 
            System.err.println("Archivo no encontrado");
        }
       
    }
}
