import java.util.*;
public class ProfitLoss{
	public static void main(String args[]){
		int COST_PRICE= 129;
		int SELLING_PRICE=191;

		int PROFIT= SELLING_PRICE - COST_PRICE ; 
		double PROFIT_PERCENT= (double)PROFIT/COST_PRICE * 100 ;

		System.out.println("The Cost Price is INR "+ COST_PRICE + "and Selling Price is INR "+ SELLING_PRICE);
		

		System.out.println("The profit is INR " + PROFIT + "and the profit percentage is "+ String.format("%.2f",PROFIT_PERCENT)+ "%");		
}}
