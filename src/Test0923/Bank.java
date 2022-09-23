package Test0923;

import java.util.Scanner;

public class Bank {
      //가
	String name= "박명수";  //예금주 
	String account = "23434-22-111";   //계좌번호
    int balance=0;  // 잔액
    int a; //인출할 금액
    int b; //입금할 금액
	
    @Override
	public String toString() {
		return "Bank [예금주=" + name + ", 계좌번호=" + account + ", 잔액=" + balance + "]";
	}
    
	public Bank () {}
	
      //나
	public void output (String name, String account,int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
		
	}
	
	public void deposit(int b) {  //입금
	   
	    balance= b + balance;
	    System.out.println("입금한 금액은 " + b + "원 입니다.");
	    System.out.println("잔액은 " + balance + "원 입니다.");
	
	}
	
	
	public void withdraw (int a) { //인출
	      
		     if (a > balance) {
		    	 System.out.println("잔액이 부족합니다.");
		     }else {
		    	 balance=balance-a;
		       System.out.println("출금한 금액은 " + a + "원 입니다.");
		       System.out.println("잔액은 " + balance + "원 입니다.");
		     }
	}
	
	
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
		System.out.println("입금할 금액을 입력하세요");
		int b= input.nextInt();
		System.out.println("출금할 금액을 입력하세요");
		int a = input.nextInt();
		
		System.out.println();
	    Bank bb = new Bank ();
	   
		bb.deposit(b);
		bb.withdraw(a);
		
		System.out.println(bb.toString());
		
	}


}
