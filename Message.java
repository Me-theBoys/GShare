package Chat;

import java.util.Calendar;

/**
 * The basic unit of a message.
 *
 * @date 12.12.2019
 */
public class Message {

    private String msg;
    private Calendar calendar;
    private String time;
    private long millisecond;

    /**
     * The constructor of the message class.
     *
     * @param msg the string message
     */
    public Message( String msg ) {
        this.msg = msg;
        calendar = Calendar.getInstance();
        time = getTime();
        millisecond = createMillisecond();
    }

    /**
     * Use this for database
     * @param msg
     * @param time
     */
    public Message( String msg , String time, long msecond ) {
        this.msg = msg;
        this.time = time;
        this.millisecond = msecond;
    }

    /**
     * Gets the message string.
     *
     * @return msg message.
     */
    public String getMessage() {
        return msg;
    }

    /**
     * Gets the current time which shows the full date hour and minute.
     *
     * @return str the Time string.
     */
    private String getTime() {
        String newMinute = calendar.get( Calendar.MINUTE ) + "";
        if(calendar.MINUTE / 10 == 0 ){
            newMinute = 0 + "" + calendar.get( Calendar.MINUTE );
        }
        String str = "" + calendar.get( Calendar.DATE ) + "." + (calendar.get( Calendar.MONTH ) + 1) + "." +
                calendar.get( Calendar.YEAR ) + " " + calendar.get( Calendar.HOUR_OF_DAY ) + ":" + newMinute;
        return str;
    }


    public String getCurrentTime() {
        return time;
    }

    public int compareTo( Message msg ){
        if( this.getMillisecond() < msg.getMillisecond() ){
            return -1;
        }
        if( this.getMillisecond() > msg.getMillisecond() ) {
            return 1;
        }
        return 0;
    }
    
   private long createMillisecond() {
       return calendar.getTimeInMillis();
   }
    public long getMillisecond() {
        return millisecond;
    }



}
