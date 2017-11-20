import java.io.*;

public class CContarPalabras 
{
 public static void main(String[] args) //Contar caracteres, palabras y lineas en un texto
 {
  final char eof = (char) - 1;
  char car;
  boolean palabra = false;
  int ncaracteres = 0, npalabras = 0, nlineas = 0, 
  
  try
  {
   System.out.println("Introducir texto. " + "Pulse [Enter] despues de cada linea.");
   System.out.println("Para finalizar pulsar Ctrl+z.\n");
   
   while ((car = (char)System.in.read()) != eof)
   {
    //[Enter] = CRLF = \r\n
    if (car == '\r') continue; //Le sigue un \n
    ncaracteres++; //Contador de caracteres
    
    //Eliminar blancos, tabuladores y finales de linea entre palabras
    if (car == ' ' || car == '\n' || car == '\t')
    palabra  = false;
    else if (!palabra)//comienza una palabra
    {
     npalabras++; //contador de palabras
     palabra = true;
    }
    if (car == '\n')//Finaliza una linea
     nlineas++;
 //if (car == 'a' || car == 'A')//cuenta letras A
 //    totalA++;
   }
   System.out.println();
   System.out.println("numeros de caracteres es igual" + ncaracteres );
  System.out.println( "numeros de palabras es igual" + npalabras );
  System.out.println("numeros de lineas es igual" + nlineas);
 
}
  catch(IOException ignorada){}
 }   
}



