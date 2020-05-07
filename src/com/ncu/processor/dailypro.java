package com.ncu.processor;
import java.lang.*;
import java.io.*;
import java.util.*;

 public class dailypro
{
 int i,sum,z,sum1,w;
  String date=null;
  String date2=null;
  String a1=null;
  String b1=null;
  String date3=null;
  String u1=null;
  


  public dailypro (int i,int z,String date,String date2,String a1,String b1,int w, String date3, String u1){

    this.i=i;
    this.z=z;
    this.w=w;
    this.date=date;
    this.date2=date2;
    this.a1=a1;
    this.b1=b1;
    this.date3=date3;
    this.u1=u1;

  }
  
  
  public int cases() throws IOException  {
    

            FileWriter fout = new FileWriter("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+a1+  File.separator +date,true);

            BufferedWriter bout= new BufferedWriter(fout);

             Scanner sc = new Scanner(System.in);

    
    
    switch (i) {
                  
    case 1:
      System.out.println("Pen       |rs70    |");
        bout.write("1. |Pen       |rs70    |");
        bout.newLine();
        bout.close();
        return 70;
                  
                  
                
    
case 2:
        System.out.println("apple     |rs120   |");
        bout.write("2. |apple     |rs120   |");
         bout.newLine();
         bout.close();
         return 120;


case 3:
       System.out.println("banana    |rs60    |");
       bout.write("3. |banana    |rs60    |");
         bout.newLine();
         bout.close();
       return 60;


case 4:
       System.out.println("notebook  |rs80    |");
       bout.write("4. |notebook  |rs80    |");
         bout.newLine();
         bout.close();
       return 80;


case 5: 
       System.out.println("lichi     |rs65    |");
       bout.write("5. |lichi     |rs65    |");
         bout.newLine();
         bout.close();
       return 65;


case 6:
       System.out.println("earphone  |rs400   |");
       bout.write("6. |earphone  |rs400   |");
         bout.newLine();
         bout.close();
       return 400;


case 7:
       System.out.println("pencil    |rs20    |");
       bout.write("7. |pencil    |rs20    |");
         bout.newLine();
         bout.close();
       return 20;


case 8:
      System.out.println("speaker   |rs500   |");
      bout.write("8. |speaker   |rs500   |");
         bout.newLine();
         bout.close();
      return 500;


case 9:
      System.out.println("orange    |rs40    |");
      bout.write("9. |orange    |rs40    |");
         bout.newLine();
         bout.close();
      return 40;


case 10:
       System.out.println("earbuds   |rs120   |");
       bout.write("10. |earbuds  |rs120   |");
         bout.newLine();
         bout.close();
       return 120;


case 11:
       System.out.println("battery   |rs600   |");
       bout.write("11.| battery  |rs600   |");
         bout.newLine();
         bout.close();
       return 600;


case 12:
      System.out.println("watch     |rs1500  |");
      bout.write("12.| watch    |rs1500  |");
         bout.newLine();
         bout.close();
      return 1500;


case 13:
      System.out.println("charger   |rs200   |");
      bout.write("13.| charger  |rs200   |");
         bout.newLine();
         bout.close();
      return 200;


case 14:
      System.out.println("mouse     |rs699   |");
      bout.write("14.| mouse    |rs699   |");
         bout.newLine();
         bout.close();
      return 699;


case 15:
      System.out.println("kiwi      |rs40    |");
      bout.write("15.| kiwi     |rs40    |");
         bout.newLine();
         bout.close();
      return 40;


case 16:
       System.out.println("cherry    |rs60    |");
       bout.write("16.| cherry   |rs60   |");
         bout.newLine();
         bout.close();
       return 60;


case 17:
      System.out.println("avocado   |rs70    |");
      bout.write("17.| avocado  |rs70    |");
         bout.newLine();
         bout.close();
      return 70;


case 18:
      System.out.println("Tea       |rs150   |");
      bout.write("18.| Tea      |rs150   |");
         bout.newLine();
         bout.close();
      return 150;


case 19:
      System.out.println("phone     |rs13999 |");
      bout.write("19.| phone    |rs13999 |");
         bout.newLine();
         bout.close();
      return 13999;


case 20:
      System.out.println("apricots  |rs299");
      bout.write("20.| apricots |rs299   |");
         bout.newLine();
         bout.close();
      return 299;
    

                  

                  


                  default:
                  System.out.println("your total amount is");
                  return 0 ;
  }
}

 
public int delete() throws IOException  {
 

    
           
            FileWriter fout = new FileWriter("C:\\Users\\Ishaan\\Desktop\\java\\daily\\data\\"+b1+  File.separator +"delete.txt",true);

            BufferedWriter bout= new BufferedWriter(fout);

             Scanner sc = new Scanner(System.in);

    
    
    switch (z) {
case 1:
      System.out.println("Pen       |rs70    |");
        bout.write("1. |Pen       |rs70    |");
        bout.newLine();
        bout.close();
        return 70;
                  
                  
                
    
case 2:
        System.out.println("apple     |rs120   |");
        bout.write("2. |apple     |rs120   |");
         bout.newLine();
         bout.close();
         return 120;


case 3:
       System.out.println("banana    |rs60    |");
       bout.write("3. |banana    |rs60    |");
         bout.newLine();
         bout.close();
       return 60;


case 4:
       System.out.println("notebook  |rs80    |");
       bout.write("4. |notebook  |rs80    |");
         bout.newLine();
         bout.close();
       return 80;


case 5: 
       System.out.println("lichi     |rs65    |");
       bout.write("5. |lichi     |rs65    |");
         bout.newLine();
         bout.close();
       return 65;


case 6:
       System.out.println("earphone  |rs400   |");
       bout.write("6. |earphone  |rs400   |");
         bout.newLine();
         bout.close();
       return 400;


case 7:
       System.out.println("pencil    |rs20    |");
       bout.write("7. |pencil    |rs20    |");
         bout.newLine();
         bout.close();
       return 20;


case 8:
      System.out.println("speaker   |rs500   |");
      bout.write("8. |speaker   |rs500   |");
         bout.newLine();
         bout.close();
      return 500;


case 9:
      System.out.println("orange    |rs40    |");
      bout.write("9. |orange    |rs40    |");
         bout.newLine();
         bout.close();
      return 40;


case 10:
       System.out.println("earbuds   |rs120   |");
       bout.write("10. |earbuds  |rs120   |");
         bout.newLine();
         bout.close();
       return 120;


case 11:
       System.out.println("battery   |rs600   |");
       bout.write("11.| battery  |rs600   |");
         bout.newLine();
         bout.close();
       return 600;


case 12:
      System.out.println("watch     |rs1500  |");
      bout.write("12.| watch    |rs1500  |");
         bout.newLine();
         bout.close();
      return 1500;


case 13:
      System.out.println("charger   |rs200   |");
      bout.write("13.| charger  |rs200   |");
         bout.newLine();
         bout.close();
      return 200;


case 14:
      System.out.println("mouse     |rs699   |");
      bout.write("14.| mouse    |rs699   |");
         bout.newLine();
         bout.close();
      return 699;


case 15:
      System.out.println("kiwi      |rs40    |");
      bout.write("15.| kiwi     |rs40    |");
         bout.newLine();
         bout.close();
      return 40;


case 16:
       System.out.println("cherry    |rs60    |");
       bout.write("16.| cherry   |rs60   |");
         bout.newLine();
         bout.close();
       return 60;


case 17:
      System.out.println("avocado   |rs70    |");
      bout.write("17.| avocado  |rs70    |");
         bout.newLine();
         bout.close();
      return 70;


case 18:
      System.out.println("Tea       |rs150   |");
      bout.write("18.| Tea      |rs150   |");
         bout.newLine();
         bout.close();
      return 150;


case 19:
      System.out.println("phone     |rs13999 |");
      bout.write("19.| phone    |rs13999 |");
         bout.newLine();
         bout.close();
      return 13999;


case 20:
      System.out.println("apricots  |rs299");
      bout.write("20.| apricots |rs299   |");
         bout.newLine();
         bout.close();
      return 299;
    

                 

                  

                  


                  default:
                  System.out.println("your total after deleting items is");
                  return 0 ;
  }
}

public int update() throws IOException  {
 

    
           
            FileWriter fout = new FileWriter("C:\\Users\\Ishaan\\Desktop\\java\\daily\\data\\"+u1+  File.separator +"update.txt",true);

            BufferedWriter bout= new BufferedWriter(fout);

             Scanner sc = new Scanner(System.in);

    
    
    switch (w) {
case 1:
      System.out.println("Pen       |rs70    |");
        bout.write("1. |Pen       |rs70    |");
        bout.newLine();
        bout.close();
        return 70;
                  
                  
                
    
case 2:
        System.out.println("apple     |rs120   |");
        bout.write("2. |apple     |rs120   |");
         bout.newLine();
         bout.close();
         return 120;


case 3:
       System.out.println("banana    |rs60    |");
       bout.write("3. |banana    |rs60    |");
         bout.newLine();
         bout.close();
       return 60;


case 4:
       System.out.println("notebook  |rs80    |");
       bout.write("4. |notebook  |rs80    |");
         bout.newLine();
         bout.close();
       return 80;


case 5: 
       System.out.println("lichi     |rs65    |");
       bout.write("5. |lichi     |rs65    |");
         bout.newLine();
         bout.close();
       return 65;


case 6:
       System.out.println("earphone  |rs400   |");
       bout.write("6. |earphone  |rs400   |");
         bout.newLine();
         bout.close();
       return 400;


case 7:
       System.out.println("pencil    |rs20    |");
       bout.write("7. |pencil    |rs20    |");
         bout.newLine();
         bout.close();
       return 20;


case 8:
      System.out.println("speaker   |rs500   |");
      bout.write("8. |speaker   |rs500   |");
         bout.newLine();
         bout.close();
      return 500;


case 9:
      System.out.println("orange    |rs40    |");
      bout.write("9. |orange    |rs40    |");
         bout.newLine();
         bout.close();
      return 40;


case 10:
       System.out.println("earbuds   |rs120   |");
       bout.write("10. |earbuds  |rs120   |");
         bout.newLine();
         bout.close();
       return 120;


case 11:
       System.out.println("battery   |rs600   |");
       bout.write("11.| battery  |rs600   |");
         bout.newLine();
         bout.close();
       return 600;


case 12:
      System.out.println("watch     |rs1500  |");
      bout.write("12.| watch    |rs1500  |");
         bout.newLine();
         bout.close();
      return 1500;


case 13:
      System.out.println("charger   |rs200   |");
      bout.write("13.| charger  |rs200   |");
         bout.newLine();
         bout.close();
      return 200;


case 14:
      System.out.println("mouse     |rs699   |");
      bout.write("14.| mouse    |rs699   |");
         bout.newLine();
         bout.close();
      return 699;


case 15:
      System.out.println("kiwi      |rs40    |");
      bout.write("15.| kiwi     |rs40    |");
         bout.newLine();
         bout.close();
      return 40;


case 16:
       System.out.println("cherry    |rs60    |");
       bout.write("16.| cherry   |rs60   |");
         bout.newLine();
         bout.close();
       return 60;


case 17:
      System.out.println("avocado   |rs70    |");
      bout.write("17.| avocado  |rs70    |");
         bout.newLine();
         bout.close();
      return 70;


case 18:
      System.out.println("Tea       |rs150   |");
      bout.write("18.| Tea      |rs150   |");
         bout.newLine();
         bout.close();
      return 150;


case 19:
      System.out.println("phone     |rs13999 |");
      bout.write("19.| phone    |rs13999 |");
         bout.newLine();
         bout.close();
      return 13999;


case 20:
      System.out.println("apricots  |rs299");
      bout.write("20.| apricots |rs299   |");
         bout.newLine();
         bout.close();
      return 299;
    

                 

                  

                  


                  default:
                  System.out.println("your total after updating items is");
                  return 0 ;
  }
}


    public void del()throws IOException
    {
       String s2,s3,b3;
        PrintWriter pw = new PrintWriter("C:\\Users\\Ishaan\\Desktop\\java\\daily\\data\\"+ b1 +  File.separator + "output.txt");
    BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+ b1 +  File.separator + date2));
    s2=bf.readLine();
    while(s2!=null){
        boolean flag =false;
      
       BufferedReader bf1 = new BufferedReader(new FileReader("C:\\Users\\Ishaan\\Desktop\\java\\daily\\data\\"+b1+  File.separator +"delete.txt"));
       s3=bf1.readLine();
       while(s3!=null)
       {
        if (s2.equals(s3)) {
          flag = true;
          break;
        }
        s3=bf1.readLine();
      }
       if(!flag)
                pw.println(s2); 
              
            s2 = bf.readLine(); 
}
           pw.flush(); 
           bf.close(); 
        pw.close(); 
         BufferedReader out = new BufferedReader(new FileReader("C:\\Users\\Ishaan\\Desktop\\java\\daily\\data\\"+b1+  File.separator + "output.txt"));
         PrintWriter dr = new PrintWriter("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+b1+  File.separator + date2);
        
    while((b3=out.readLine())!=null){
       dr.println(b3);
      }
       
      dr.flush();
      out.close();
      dr.close();

       
       
}

public void up()throws IOException
    {
       String p2;
       
        BufferedReader zf1 = new BufferedReader(new FileReader("C:\\Users\\Ishaan\\Desktop\\java\\daily\\data\\"+u1+  File.separator +"update.txt"));
        PrintWriter quot = new PrintWriter(new FileWriter("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+u1+  File.separator +date3, true));
        while((p2=zf1.readLine())!=null){
         quot.println(p2);
      }
      zf1.close();
      quot.flush(); 
      quot.close();
}

public void total()throws IOException{
 
              
        Scanner s = new Scanner(new File("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+ b1 +  File.separator + "sum1.txt"));
        Scanner p = new Scanner(new File("C:\\Users\\Ishaan\\Desktop\\java\\daily\\data\\"+ b1 +  File.separator + "sum2.txt"));
        int tmp1 = s.nextInt();
        int tmp2 = p.nextInt();
        int su= tmp1-tmp2;
        System.out.println(su);
        PrintWriter scout = new PrintWriter(new FileWriter("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+b1+  File.separator +"sum1.txt"));
        scout.println(su);

        scout.flush();
        scout.close();
    }


   public void total2()throws IOException{
 
              
        Scanner s = new Scanner(new File("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+ u1 +  File.separator + "sum1.txt"));
        Scanner p = new Scanner(new File("C:\\Users\\Ishaan\\Desktop\\java\\daily\\data\\"+ u1 +  File.separator + "sum3.txt"));
        int tmp1 = s.nextInt();
        int tmp2 = p.nextInt();
        int fu= tmp1+tmp2;
        System.out.println(fu);
        PrintWriter dout = new PrintWriter(new FileWriter("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+u1+  File.separator +"sum1.txt"));
        dout.println(fu);

        dout.flush();
        dout.close();
  
}
}

  class testdaily{
    public static void main(String[] args) throws IOException {
      
      int x=0;
      int sum=0;
      int i=1;
      int z=1;
      int e=0;
      int sum1=0;
      int total=0;
      String a1=null;
      String a2=null;
      String a3=null;
      String date=null;
      String b1= null;
      String date2=null;
      String date3=null;
      String u1=null;
      String u2=null;
      int sum4=0;
      int w=1;
      int q=0;
     

      System.out.println("enter date");
      Scanner y=new Scanner(System.in);
      a1=y.next();
      date=a1;
      a2=".txt";
      date+=a2;
       File file = new File("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+a1);

       if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("new list is created");
            } else {
                System.out.println("this list already exists");
            }
        }
      while(i!=0){
        i=y.nextInt();
       dailypro b=new dailypro(i,z,date,date2,a1,b1,w,date3,u1);

        x=b.cases();
        sum=sum+x;
    }
    System.out.println(sum);
    File ri = new File("C:\\Users\\Ishaan\\Desktop\\java\\daily\\data\\"+a1);
     if (!ri.exists()) {
            if(ri.mkdir());
          }
    PrintWriter fk  = new PrintWriter("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+ a1 +  File.separator + "sum1.txt");
    fk.println(sum);
     fk.flush();
    fk.close();
   
      




      System.out.println("enter date2");
      b1=y.next();
      date2=b1;
      date2+=a2;
     
      File fi = new File("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+b1);
      if (fi.exists()) 
      {

      BufferedReader add = new BufferedReader(new FileReader("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+b1+  File.separator +date2));
    while((a3=add.readLine())!=null){
        System.out.println(a3);
      }
      while(z!=0){
        z=y.nextInt();
        dailypro c=new dailypro(i,z,date,date2,a1,b1,w,date3,u1);

        e=c.delete();
        sum1=sum1+e;
    }
     PrintWriter zk  = new PrintWriter("C:\\Users\\Ishaan\\Desktop\\java\\daily\\data\\"+ b1 +  File.separator + "sum2.txt");
    zk.println(sum1);
     zk.flush();
    zk.close();
     
    System.out.println(total);
     dailypro d=new dailypro(i,z,date,date2,a1,b1,w,date3,u1);
      d.del(); 
      d.total();
    }
    else {
        System.out.println("no such list exists");
      } 




  System.out.println("enter date3");
   
      u1=y.next();
      date3=u1;
      u2=".txt";
      date3+=u2;
       File file1 = new File("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+u1);

       if (!file1.exists()) {
             
                System.out.println("This file does not exists");
             
            }
            else {
                while(w!=0){
        w=y.nextInt();
       dailypro t=new dailypro(i,z,date,date2,a1,b1,w,date3,u1);

        q=t.update();
        sum4=sum4+q;
    }
    PrintWriter qk  = new PrintWriter("C:\\Users\\Ishaan\\Desktop\\java\\daily\\data\\"+ b1 +  File.separator + "sum3.txt");
    qk.println(sum4);
    qk.flush();
    qk.close();
   dailypro qr=new dailypro(i,z,date,date2,a1,b1,w,date3,u1);
    qr.up(); 
    qr.total2();
    }

  }
}

  