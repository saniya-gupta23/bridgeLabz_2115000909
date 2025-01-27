import java.util.*;
public class Pens{
	public static void main(String args[]){
		int totalPens =14;
		int students =3;

		int PenPerStudent = totalPens / students ;

		int remainingPens = totalPens % students ;

		System.out.println("The pen per student is "+ PenPerStudent + "and the remaining pen not distributed is " + remainingPens);
}}  

