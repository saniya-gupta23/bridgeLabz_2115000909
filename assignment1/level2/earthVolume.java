import java.util.*;
public class earthVolume{
	public static void main(String args[]){
		double radiusInKm= 6378;
		double pi= Math.PI;
		double volumeInKm3= (4.0 / 3.0) * pi * Math.pow(radiusInKm,3);
		double conversionFactor= 0.239913;
		double volumeInMiles3= volumeInKm3 * conversionFactor;
		System.out.println("The volume of earth in cubic kilometers is "+ volumeInKm3 + "and cubic miles is "+ volumeInMiles3);
}}
