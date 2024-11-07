package org.example.task4;

public class Clock implements Readable{
    private int hours;
    private int minutes;
    private int secunds;

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecunds(int secunds) {
        this.secunds = secunds;
    }

    public int getHours(int hours) {
        return hours;
    }

    public int getMinutes(int minutes) {
        return minutes;
    }

    public int getSecunds(int secunds) {
        return secunds;
    }

    @Override
    public void readTime() {
        System.out.println("Current time: "+ hours + ":" + minutes + ":" + secunds);

    }
    @Override
    public void tick() {
        this.secunds++;

        if(secunds == 60)
        {
            secunds = 0;
            minutes++;

            if(minutes == 60)
            {
                minutes = 0;
                hours++;

                if(hours == 24)
                    hours = 0;
            }
        }
    }
}
