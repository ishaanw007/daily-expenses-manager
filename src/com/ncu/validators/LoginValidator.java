package com.ncu.validators;
import com.ncu.exceptions.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
import java.util.*;



public class LoginValidator{
	public boolean loginValidator(String login, String password){
		System.out.println("Login id is: "+login+" and password is:"+password);
		boolean b;
		Properties prop = new Properties();
		FileInputStream input=null;
		
		try{
			input = new FileInputStream("C:\\Users\\Ishaan\\Desktop\\java\\daily\\config\\constants\\exceptions.properties");
			prop.load(input);
			loginempty(login);
			specialCharacter(login);
		}
		catch(LoginNameException e){
			 String s =prop.getProperty("LoginNameException");
			 System.out.println(s);
			 return false;
		}
		
		catch(SpecialCharacterException e){
			 String s =prop.getProperty("specialCharacter");
			 System.out.println(s);
			return false;
		}
		catch(Exception e){
			System.out.println(e);
		}
		b=passLength(password);
		if (b==true)
			return false;
		
		b=passempty(password);
		if (b==true)
			return false;
		b=username(login);
		if (b==true)
			return false;

		
		return true;
	}
	
	private void loginempty(String login)throws LoginNameException {
		if (login.equals("")) {
			throw new LoginNameException("Login Name Exception");
	}
		}
		private void specialCharacter(String login)throws SpecialCharacterException {
		Pattern  patternGet = Pattern.compile("[@#$%^&(,)_]");
		Matcher check = patternGet.matcher(login);
		boolean finalValue = check.find();
		if (finalValue == true){
			throw new SpecialCharacterException("Speacial Character Exception");
	}
		}
		
	
	boolean passLength(String password){
		int passLength=14;
		
		if(password.length()>passLength)
			return true;
		else
			return false;
	}
	
	boolean passempty(String password) {
		if (password.equals("")) {
			return true;
		}
		else{
			return false;
		}
	}
	boolean username(String login)
    {
        
        if(login.equals("ishaan")){
        	return false;
        }
		
		else{
			return true;
           
       	
    }
	
	}
}



class testLogin{
	public static void main(String[] args){
		
		LoginValidator check = new LoginValidator();
		boolean checkLogin = check.loginValidator(" ","ishaan");
		System.out.println(checkLogin);
		checkLogin = check.loginValidator("ishaan","ishaan");
		System.out.println(checkLogin);
		checkLogin = check.loginValidator("ishaan$","ishaan");
		System.out.println(checkLogin);
		checkLogin = check.loginValidator("ishaan"," ");
		System.out.println(checkLogin);
		
		
	}
		
	}
		
