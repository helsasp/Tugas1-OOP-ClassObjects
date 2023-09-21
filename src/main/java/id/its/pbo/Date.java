package id.its.pbo;


public class Date {
	
    private int month;
    private int day;
    private int year;

   // konstruktor
    public Date(int month, int day, int year) {
    	
        setMonth(month);
        setYear(year);
        setDay(day);
        
    }

    // setter - getter  month (harus diantara 1-12)
    public void setMonth(int month) {
    	
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1; 
        }
        
    }

    public int getMonth() {
    	
        return month;
    }
    //setter getter day
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            
            if (month == 2) { //februari
                
                if (isleapyear() && day <= 29) { //jika kabisat, hari sampai 29
                    this.day = day;
                } else if (day <= 28) {
                    this.day = day;
                } else {
                    this.day = 1; 
                }
  
            } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) { // terdapat 31 hari
                this.day = day;
                
            } else if (day <= 31) {
                this.day = day;
                
            } else {
                this.day = 1; 
            }
        } else { // jika tidak memenuhi kondisi di atas
            this.day = 1; 
        }
    }

    public int getDay() {
        return day;
    }

    //setter getter year harus positif
    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
            
        } else {
            this.year = 0;
        }
    }

    public int getYear() {
        return year;
    }

    // display M/D/Y
    public String displayDate() {
        return month + "/" + day + "/" + year;
    }

   //check apakah kabisat? 
    private boolean isleapyear() {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ;
        
    }
}

//program
class DateProgram {
    public static void main(String[] args) {
        
        Date date1 = new Date(6, 23, 2004); 

        System.out.println("Tanggal: " + date1.displayDate());

       
       
    }
}
