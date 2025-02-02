import java.util.*;
public class Hotel{
	private String guestName;
	private String roomType;
	private int nights;

	//default cons
	public Hotel(){
		this.guestName = "unknown";
		this.roomType ="Standard";
		this.nights = 1;
	}

	//parameterized cons
	public Hotel(String guestName , String roomType , int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}

	//copy cons
	public Hotel(Hotel otherHotel){
		this.guestName = otherHotel.guestName;
		this.roomType = otherHotel.roomType;
		this.nights = otherHotel.nights;
	}

	public String getGuestName(){
		return guestName;
	}

	public String getRoomType(){
		return roomType;
	}
	
	public int getNights(){
		return nights;
	}

	
	@Override
	public String toString(){
		return "HotelBooking{guestName='" + guestName + "' , roomType =' " + roomType + "', nights= " + nights + "}" ;
	}

	public static void main(String args[]){
		Hotel defaultBooking = new Hotel();
		Hotel customBooking = new Hotel("Saniya","deluxe room",22);
		Hotel copiedBooking = new Hotel(customBooking);

		System.out.println(defaultBooking);
		System.out.println(customBooking);
		System.out.println(copiedBooking);
	}
}
