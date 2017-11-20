import java.io.*;

public class CContarPalabras 
{
 public static void main(String[] args) //Contar caracteres, palabras y lineas en un texto
 {
  final char eof = (char) - 1;
  char car;
  boolean palabra = false;
<<<<<<< HEAD
  int ncaracteres = 0, npalabras = 0, nlineas = 0, 
=======
  int ncaracteres = 0, npalabras = 0, nlineas = 0, totalA=0;
>>>>>>> 5f358de... imprime el numero de A en le texto
  
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
<<<<<<< HEAD
 //if (car == 'a' || car == 'A')//cuenta letras A
 //    totalA++;
=======
 if (car == 'a' || car == 'A')//cuenta letras A
     totalA++;
>>>>>>> 5f358de... imprime el numero de A en le texto
   }
   System.out.println();
   System.out.println("numeros de caracteres es igual" + ncaracteres );
  System.out.println( "numeros de palabras es igual" + npalabras );
  System.out.println("numeros de lineas es igual" + nlineas);
<<<<<<< HEAD
 
=======
 System.out.prinln ("el numero total de letras A es" + totalA"); 
>>>>>>> 5f358de... imprime el numero de A en le texto
}
  catch(IOException ignorada){}
 }   
}



