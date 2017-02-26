package q1;

import java.util.*;
import java.io.*;
import java.time.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Q1 {
    
    public static void main(String[] args) throws IOException
    {
       int i=0,j=0;
    
    random md= new random();
    md.g();
    // creating instances of file having boy's and girl's records
    File f1 = new File("b.csv");
    File f2 = new File("g.csv");

    //array of objects of class boy and girl to store their attributes
    boy binfo[] = new boy[1000];
    girl ginfo[] = new girl[1000];
    BufferedReader br = new BufferedReader(new FileReader("b.csv"));
    int l2=0;
    try
    {
        String line;
        
        while ((line = br.readLine()) !=null){
	String[] rec = line.split(",");
		//passing parameters to boy
	binfo[i] = new boy(rec[0],Integer.parseInt(rec[1]),Integer.parseInt(rec[2]),Integer.parseInt(rec[3]),Integer.parseInt(rec[4]));
	i++;
        l2++;
	}
    }finally{
        br.close(); 
    }
    
    br = new BufferedReader(new FileReader("g.csv"));
    int l1=0;
    try{
        i=0;
        
        String line;
        while ((line = br.readLine()) !=null){
        String[] rec1 = line.split(",");
		//passing parameters to girl
        ginfo[i] = new girl(rec1[0],Integer.parseInt(rec1[1]),Integer.parseInt(rec1[2]),Integer.parseInt(rec1[3]));
        i++;
        l1++;
    }
    }finally{
    br.close();
    }

    try{
       
    PrintWriter writer = new PrintWriter("logging_utility.csv","UTF-8");
    for(i=0; i<l1; i++)
    {
        for(j=0; j<l2; j++)
        {
	  if( ginfo[i].status == false && binfo[j].status == false && 
                  binfo[j].budget >=ginfo[i].budget && binfo[j].req <= ginfo[i].attractiveness)
           {
			binfo[j].status = true;
			ginfo[i].status = true;     //setting status to true ie committed for newly formed pair
			writer.println(binfo[j].name+" got committed with "+ginfo[i].n+" on "+LocalDate.now());
			
	   }
          
	}
     }
    writer.close();
    }
    catch (IOException e) {
   // do something
    }
    } 
}
