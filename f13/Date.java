class Date {
    private int day;
    private int month;
    private int year;

    public Date(){
        this(10, 10, 1970);
    }
    public Date(int day){
        this(day, 10, 1970);
    }
    public Date(int day, int month){
        this(day, month, 1970);
    }
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date(final Date object){
        this(object.getDay(), object.getMonth(), object.getYear());
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display(){
        System.out.printf("%02d:%02d:%04d\n", day, month, year);
    }
    public Date previous(){
        if(day==1){
            if(month==1){
                return new Date(31, 12, year-1);
            }
            else if(month==3){
                if(year%4==0){
                    return new Date(29, month-1, year);
                }
                else{
                    return new Date(28, month-1, year);
                }
            }
            else if(month==5||month==7||month==8||month==10||month==12){
                return new Date(30, month-1, year);
            }
            else{
                return new Date(31, month-1, year);
            }
        }
        else{
            return new Date(day-1, month, year);
        }
    }
    public Date next(){
        if(month==2){
            if(day==28){
                if(year%4==0){
                    return new Date(29, month, year);
                }
                else{
                    return new Date(1, month+1, year);
                }
            }
            else if(day==29){
                return new Date(1, month+1, year);
            }
            else{
                return new Date(day+1, month, year);
            }
        }
        else if(day==30){
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                return new Date(day+1, month, year);
            }
            else{
                return new Date(1, month+1, year);
            }
        }
        else if(day==31){
            if(month==12){
                return new Date(1, 1, year+1);
            }
            else{
                return new Date(1, month+1, year);
            }
        }
        else{
            return new Date(day+1, month, year);
        }
    }
}

