import java.util.*;

 
 class Date
 {
    int day, month, year;
	
	Date(){
		day = 01;
		month= 01;
		year = 1970;
	}
	
	Date(int day){
	    this.day=day;
		month= 01;
		year = 1970;
	}
	
	Date(int day,int month){
	    this.day=day;
		this.month=month;
		year = 1970;
	}
	
	Date(int day,int month,int year){
	    this.day  = day;
		this.month=month;
		this.year = year;
	}
	
	Boolean isLeapYear(int year){
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) 
			return true;
		return false;
	}
	
	void printPreviousDay(){   
	   if(day!=1){
		   System.out.println("PreviousDay: "+(day-1)+"/"+month+"/"+year); 
	   }
	   else{
		   int newDay=0;
		   int newMonth=0;
		   int newYear=0;
		   int months[]={2,4,6,9,11};
		   List listMonths = Arrays.asList(months);
		   if(listMonths.contains(month)){
			   newDay=31;
		   }
		   else if(month==3){
			   if(isLeapYear(year)) newDay=29;
			   else newDay=28;
			   newMonth=2;
			   newYear=year;
		   }
		   else if(month==1){
			   newDay=31;
			   newMonth=12;
			   newYear=year-1;
		   }
		   else{
			   newDay=30;
			   newMonth=month-1;
			   newYear=year;
		   }
	
		    System.out.println("PreviousDay: "+newDay+"/"+newMonth+"/"+newYear); 
	   }
	}
	 
	
	void printNextDay(){
		int newDay=0;
		int newMonth=month;
		int newYear=year;
		int months[]={4,6,9,11};
		List listMonths = Arrays.asList(months);
		if(listMonths.contains(month) && day==30){
			newDay=1;
			newMonth=month+1;
		}
		else if(month==2){
			if(isLeapYear(year) && day==28){
				newDay=29;
			}
			else if (day==28 || day==29){
				newDay=1;
				newMonth=3;
			}
			
		}
		else if(!listMonths.contains(month) && day==31){
			newDay=1;
			if(month==12){
				newMonth=1;
				newYear=year+1;
			}
		}
		else{
			newDay=day+1;
		}
		System.out.println("NextDay: "+newDay+"/"+newMonth+"/"+newYear); 
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	  
		System.out.println("Enter date month &year Number:");
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
	    Date d1= new Date(date,month,year);
		
		d1.printPreviousDay();
		d1.printNextDay();
		  
		
		 
	}
}