
package com.mycompany.digitalclock;
import java.util.Date;

public class ClockThread extends Thread{
    main DigitalClock;
    String time;
    
    public ClockThread(main DigitalClock){
        this.DigitalClock = DigitalClock;
        start();
    }
    public void run(){
        while(true){
            time = "" + new Date();
            DigitalClock.jlabelClock.setText(time);
        }
         
    }
}
