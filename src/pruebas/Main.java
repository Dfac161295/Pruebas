/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author DanielAC
 */
public class Main {

    public static void main(String[] args) {

       int inipag = 0;
       int finpag = 0;
       int pagina = 48;
       int iterador = 0;
       
       
       
       if((pagina-1)%10==0){
       inipag = pagina;
       finpag = inipag+9;
       }else{
       
       int flag = pagina-10; 
       
       
       if(flag < 0){
       flag = flag * -1;
       finpag = pagina + flag;
       inipag = finpag - 9;
       }else{
      
       int flag2 = flag;
           
       while(flag2%10!=0){
          
           flag2++;
           iterador++;
       }        
       
       inipag = (flag + iterador)+1;
       finpag = inipag + 9;
       
       
       }
       
           
       }
       
       if(pagina%10==0){
       finpag = pagina;
       inipag = finpag-9;
       }

       
       for(int j = inipag; j<=finpag; j++){
           System.out.println("pagina "+j);
       }
       
       
       
    }

}
