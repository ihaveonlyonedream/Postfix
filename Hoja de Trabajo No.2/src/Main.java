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
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
       
        try{
            
            FileInputStream archivo = new FileInputStream("C:\\Users\\Luis\\Desktop\\Java\\postfix\\Postfix\\Hoja de Trabajo No.2\\src\\Datos.txt");
            DataInputStream entrada = new DataInputStream(archivo);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String linea;
            
            while ((linea = buffer.readLine()) != null)   {
                
                String[] lineaArray = linea.split(" ");
                
                for (int i = 0; i < lineaArray.length; i++) {
                    System.out.println(lineaArray[i]);
                }
            }
            entrada.close();
        }catch (Exception e){ 
            System.err.println("Archivo no encontrado");
        }
       
    }
}
