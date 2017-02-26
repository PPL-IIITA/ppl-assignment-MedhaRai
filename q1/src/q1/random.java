package q1;

import java.util.*;
import java.io.*;
import java.math.*;
import java.io.IOException;
public class random {
          
    public  void g() 
    {
        Random rand = new Random();
        int l1, l2,n,i,j; 
        l1=(int)(Math.abs ( Math.random()*10 - Math.random()*5))+1;    //no of girls
        l2=(int) (Math.abs (Math.random()*30 - Math.random()*25));  //no of boys
        n=(int) (Math.random()*8+2);     //length of names of boys & girls
        
        char [] n1;
        String name;
        try{
            PrintWriter writer = new PrintWriter("g.csv", "UTF-8");
            for(i=0; i<l1; i++)
            {
                n1 = new char[n];
                    for(j=0; j< n; j++)
                        n1[j] = (char)Math.abs((rand.nextInt(26)+97));
                name=new String(n1);
		writer.println(name+","+(int)(Math.random()*10 + 1)+","+ 
		(int)(Math.random()*500 + 1)+","+ (int)(Math.random()*10 + 1) );
            }
	writer.close();
	writer = new PrintWriter("b.csv", "UTF-8");
        char [] n2;
        String name1;
             for(i=0; i<l2; i++){
                  n2 = new char[n];
                    for(j=0; j< n; j++)
                        n2[j] = (char)Math.abs((rand.nextInt(26)+97));
                name1=new String(n2);
                writer.println(name1+","+(int)(Math.random()*10 + 1)+","+
                    (int)(Math.random()*1000 + 1)+","+ (int)(Math.random()*10 + 1)+
                    ","+(int)(Math.random()*5 + 1) );
                }
            writer.close();

	} 
	catch (IOException e) {
		//do something
	  }
    }
}


