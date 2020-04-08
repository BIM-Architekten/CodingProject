package beispiele;

/***************************************************************/
/* Das Programm zeigt geschachtelte if-else-Anweisungen.       */
/***************************************************************/

import java.io.*;

public class IfSchachtel {

 public static void main(String args[]) throws IOException {

  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

  int sender;

  System.out.println();
  System.out.println("Bitte Sendernummer eingeben: ");
  sender = Integer.parseInt(in.readLine());

  if (sender==1)
     System.out.println("ARD");

   else

     if (sender==2)
        System.out.println("ZDF");

      else

        if (sender==3)
           System.out.println("Drittes");

         else
           System.out.println("Privat");

  }

}