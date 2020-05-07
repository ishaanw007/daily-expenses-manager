package com.ncu.main;
import com.ncu.exceptions.*;
import com.ncu.validators.*;
import com.ncu.processor.*;
import java.io.*;
import java.util.*;
class dailyexpenses{
	public static void main(String[] args) throws IOException {
		String c,lo,pass,s1,cf;
		int a;
    System.out.println("");
    
		System.out.println("Enter loginID and Password");
		System.out.println("");
    lo=getlogin();
		System.out.println("");
		pass=getpassword();
		System.out.println("");
		LoginValidator check = new LoginValidator();
		boolean b = check.loginValidator(lo,pass);
    if (b==true) {
      System.out.println("login id and password are ok");
    
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Ishaan\\Desktop\\java\\daily\\text\\products.txt"));
		while((s1=bf.readLine())!=null){
				System.out.println(s1);
			}
		Scanner x= new Scanner(System.in);
		a=x.nextInt();
		switch(a){
			case 1:
      again();
			break;
			case 2:
		  tel();
			break;
			case 3:
			remo();
			break;
			default:
			System.out.println("Error");
		}
    }
		}

		

static String getlogin(){
		String login=null;
		try{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter loginId:");
      System.out.println("");
			login = in.nextLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return login;
	}
static String getpassword(){
		String password=null;
		try{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Password:");
      System.out.println("");
			password = in.nextLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return password;
	}
	public static void again () throws IOException{
		
      int sum=0;
      int i=1;
      int z=1;
      int x=0;
      String a1=null;
      String a2=null;
      String a3=null;
      String date=null;
      String b1= null;
      String date2=null;
       String date3=null;
      String u1=null;
      String u2=null;
      int w=1;
      int q=0;
      String sam=null;
     

      System.out.println("Enter Date to add products in format (dd-mm-yy)");
      Scanner y=new Scanner(System.in);
      a1=y.next();
      date=a1;
      a2=".txt";
      date+=a2;
       File file = new File("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+a1);
            if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("New list is created");
            } 
            }
        else {
                System.out.println("This list already please select update option");
                System.exit(0);
            }
         BufferedReader af = new BufferedReader(new FileReader("C:\\Users\\Ishaan\\Desktop\\java\\daily\\text\\saman.txt"));
		    while((sam=af.readLine())!=null){
			System.out.println(sam);
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
   }

	
	public static void remo()throws IOException{

      int i=1;
      int z=1;
      int e=0;
      int sum1=0;
      String a1=null;
      String a2=null;
      String a3=null;
      String b1= null;
      String date=null;
      String date2=null;
       String date3=null;
      String u1=null;
      String u2=null;
      int w=1;
      int q=0;
	    System.out.println("Enter Date to delete products in format (dd-mm-yy)");
	    Scanner y=new Scanner(System.in);
      b1=y.next();
      date2=b1;
      a2=".txt";
      date2+=a2;
    
      File fi = new File("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+b1);
      if (fi.exists()) 
      {

      BufferedReader add = new BufferedReader(new FileReader("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+b1+  File.separator +date2));
    while((a3=add.readLine())!=null){
        System.out.println(a3);
        
      }
      System.out.println("");
      System.out.println("Please select from the list to delete");
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
     
    
     dailypro d=new dailypro(i,z,date,date2,a1,b1,w,date3,u1);
      d.del(); 
      d.total();
    }
    else {
        System.out.println("no such list exists");
        System.exit(0);
      }  
  }

  public static void tel() throws IOException{
      String date3=null;
      String u1=null;
      String u2=null;
      int w=1;
      int q=0;
      int sum4=0;
      String can=null;
      int i=1;
      int z=1;
      String a1=null;
      String a2=null;
      String a3=null;
      String b1= null;
      String date=null;
      String date2=null;
     

     System.out.println("Enter Date to update products in format (dd-mm-yy)");
     Scanner y=new Scanner(System.in);
      u1=y.next();
      date3=u1;
      u2=".txt";
      date3+=u2;
       File file1 = new File("C:\\Users\\Ishaan\\Desktop\\java\\daily\\ans\\"+u1);

       if (!file1.exists()) {
             
                System.out.println("This list does not exists please select add function to create new list");
             System.exit(0);
            }
            else {
          BufferedReader kf = new BufferedReader(new FileReader("C:\\Users\\Ishaan\\Desktop\\java\\daily\\text\\saman.txt"));
        while((can=kf.readLine())!=null){
      System.out.println(can);
      }
                while(w!=0){
        w=y.nextInt();
       dailypro t=new dailypro(i,z,date,date2,a1,b1,w,date3,u1);

        q=t.update();
        sum4=sum4+q;
    }
    PrintWriter qk  = new PrintWriter("C:\\Users\\Ishaan\\Desktop\\java\\daily\\data\\"+ u1 +  File.separator + "sum3.txt");
    qk.println(sum4);
    qk.flush();
    qk.close();
   dailypro qr=new dailypro(i,z,date,date2,a1,b1,w,date3,u1);
    qr.up(); 
    qr.total2();
    }
  }
}
  
    




	
