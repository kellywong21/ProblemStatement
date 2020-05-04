package sg.edu.rp.c346.problemstatement;

public class Holidays {
    private String holidayName;
    private String holidayDates;


    public Holidays(String holidayName, String holidayDates) {
        this.holidayName = holidayName;
        this.holidayDates = holidayDates;

    }


    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public String getHolidayDates() {
        return holidayDates;
    }

    public void setHolidayDates(String holidayDates) {
        this.holidayDates = holidayDates;
    }
}
