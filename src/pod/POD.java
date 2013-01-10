package pod;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allan
 */
import java.util.*;
import java.math.*;

    public class POD {

        private char[] c;
        private String[] s;

        public void CriaC(){
        
        this.c = new char[26];
               
        char tmp;
        int tmpi;
        
        for(tmp = 'a', tmpi = 0; tmp <= 'z'; tmp++, tmpi++){
            c[tmpi] = tmp;                        
        }
    }
    
    public char[] getC(){
        return this.c;   
}
    public String[] getS(){
        return this.s;
    }
    
    public void CriaS(int n, int TAMCHAVE){
        int j;
        int i = 0;
        int TamString = TAMCHAVE - 1;
        
        this.s = new String[n];
        Random rand = new Random();
                
        for(;i < n; i++){
            this.s[i] = "";
            for(j = 0; j < TamString; j++){
                this.s[i] = this.s[i] + this.c[Math.abs(rand.nextInt() % 26)];            
            }
                      
        }
        
    }
    //i
    public static void BubbleSort( String [ ] num )
{
     int j;
     boolean flag = true;   // set flag to true to begin first pass
     String temp;   //holding variable

     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                   if ( num[ j ].compareTo(num[j+1]) > 0 )   // change to > for ascending sort
                   {
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                          flag = true;              //shows a swap occurred  
                  } 
            } 
      } 
} 
 
    public void imprime (){
        for(String o:this.s){
            System.out.println(o);
        }
       
    }
    
    public static void InsertionSort( String [ ] num)
{
     int j;                     // the number of items sorted so far
     String key;                // the item to be inserted
     int i;  

     for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
    {
           key = num[ j ];
           for(i = j - 1; (i >= 0) && (num[ i ].compareTo(key) > 0); i--)   // Smaller values are moving up
          {
                 num[ i+1 ] = num[ i ];
          }
         num[ i+1 ] = key;    // Put the key in its proper location
     }
}
    public static void SelectionSort ( String [ ] num )
{
     int i, j, first;
     String temp;
     for ( i = num.length - 1; i > 0; i -- )  
     {
          first = 0;   //initialize to subscript of first element
          for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
          {
               if( num[ j ].compareTo(num[ first ]) > 0 ) {
                  first = j;
              }
          }
          temp = num[ first ];   //swap smallest found with element in position i.
          num[ first ] = num[ i ];
          num[ i ] = temp; 
      }           
}
    
    public static void main(String[] args){
        
        POD novo = new POD();
        
        
        novo.CriaC();
        novo.CriaS(10000, 10);
        //numero de strings que gera | tamanho da string
               
        long inicio = System.currentTimeMillis();
        BubbleSort(novo.getS());
        //InsertionSort(novo.getS());
        //SelectionSort(novo.getS());
        
        long fim = System.currentTimeMillis();
        novo.imprime();
        System.out.println(fim-inicio);
        
            
    }
    
    
}
