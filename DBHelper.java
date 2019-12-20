import Chat.*;
import Notice.Notice;
import User.User;

import java.util.ArrayList;

/**
 * REMEMBER WE DONT ADD EXTRA FEATURES NOT YET
 * AND I EXPLICITLY WROTE METHODS FOR VARIABLES SO YOU CAN EASILY SEE WHAT YOU WILL NEED TO GET TO INITIALIZE THE OBJECT
 * AND I BELIEVE USING THOSE LITTLE METHODS WILL SAVE YOU FROM CODE REUSE
 */
public class DBHelper {

    //STARTING HERE OF USER RELATED METHODS
    /**
     *This method will get the user attributes from the database and will construct an User object using
     * setter methods and constructors to insert the database information to object.
     * Logically you need to use set methods to insert the information to objects if constructor does not take it as
     * a parameter.
     * Then return the User object
     * I don't know what the parameter will be?
     *
     * IMPORTANT: I WROTE OTHER VARIABLES' METHODS EXPLICITLY SO IT IS A GOOD IDEA TO USE THOSE METHODS IN THIS METHOD
     * SO YOU CAN INITIALIZE THE OBJECT EASILY
     *AN EXAMPLE: String name = getUserName( userId );String surname = getUserSurname( usedId ); then pass those variables to the object
     *
     *
     * THIS WILL PROBABLY BE THE MOST USED METHOD MAYBE????
     */
    public static User getUser(){

    }


    /**
     * This method will return the G according to the spesific user's id
     * I WILL NOT WRITE ALL OF THEM COMMENT SINCE AFTER THIS ONE'S YOU SHOULD HAVE GOTTEN A IDEA HOW TO WRITE REALLY
     * I WROTE ALL OF THE VARIABLE METHODS SO YOU CAN CLEARLY SEE WHAT INFORMATIONS WE WILL PASS TO THE OBJECT
     * WHEN USING getUser METHOD
     */
    private static int getUserG( int userId ){

    }
    private static String getUserEmail(){}
    private static String getUserPassword(){}
    private static String getUserName(){}
    private static String getUserSurname(){}
    private static double getUserLenderRating(){}
    private static double getUserBorrowerRating(){}
    private static int getUserNumberOfLendRates(){}
    private static int getUserNumberOfBorrowRates(){}
    private static int getUserNumberOfLends(){}
    private static int getUserNumberOfBorrows(){}
    private static int getUserActiveGAmount(){}

    //STARTING HERE OF NOTICE RELATED METHODS

    /**
     * I THINK IF YOU ARE GOING TO START WRITING FIRST WRITE THE BASIC ONES THEN THE getNotice (3rd method) ONE BEFORE STARTING TO WRITE ARRAY LIST ONES
     * This method returns all the notices in the database.
     * REMEMBER: We have a sorting class that can do sort so returning all notices should be enough to show them on homepage
     * Maybe get all the information for a notice and create a notice with those information again do not forger it would be
     * a good choice to use the setter methods for the variables that does not get initialized with constructors.
     * IMPORTANT: There are 2 kind of constructors in Notice class one for lending and one for borrowing however it should be
     * ok to use any of them but PLEASE do not forget to use setNoticeType since noticeType variable automatically changes constructor to constructor
     *
     * SO maybe consider after creating and initializing that notice add it to the array list and homepage page may use it with sort methods to show
     * appropriate notices
     * Then return that array list
     *
     * AGAIN I WROTE METHODS EXPLICITLY SO YOU CAN SEE WHAT TO INITILAIZE WHEN CREATING OBJECT
     */
    public static ArrayList<Notice> getAllNotices(){

    }

    /**
     *This one different from the other specifically returns the Notices that the user have which will be the owner of the user
     * Then our sortByTime method can sort it by the publish date and can show accordingly in the my notice page maybe ??
     *
     * AN IDEA: Maybe make the parameter at the getUser method userId so you can use the getUser method in this method ( I DONT KNOW IF IT IS GOING TO WORK IT SHOULD WORK TOUGH)
     * Still not sure of the parameter you know better
     */
    public static ArrayList<Notice> getUserNotices( int userId ){

    }

    /**
     *This simply returns one spesific notice maybe it can be used at when you click on a notice on the homepage for showing its attributes that is
     *
     * You know better than me what the parameter will be so i leave it blank
     *
     * Again works similar like getUser
     */
    public static Notice getNotice(){
    }

    private static int getNoticeNoticeType(){}
    private static int getNoticeDay(){}
    private static int getNoticeCategory(){}
    private static int getNoticeRateLend(){}
    private static int getNoticeRateBorrow(){}
    private static boolean getNoticeAgreed(){}
    private static boolean getNoticeOver(){}
    private static boolean getNoticeRatedBorrow(){}
    private static boolean getNoticeRatedLend(){}
    private static String getNoticeName(){}
    private static String getNoticeNote(){}
    private static long getNoticePostingTime(){}
    private static String getNoticeComment(){}
    private static int getNoticeG(){}
    private static long getNoticeStartTime(){}
    //You will also insert users into notice since it is a variable of notice you may want to check variables of Notice class

    //Starting of chat
    /**
     *This method will return a message which is a basic unit and probably wont be used directly however may be used in chat method
     * You wont need any setters for this probably use 2nd constructor
     *
     * Determine parameter
     */
    public static Message getMessage(){

    }

    /**
     * For this one it makes sense to me to just look at the table and get the rows that contain both of the parameters but order dont matter and i think it may work
     * here is an example
     * Sender_ID     Reciever_ID     msg           time(in units)
     * 1                2            "abc"          1
     * 2                1             "dfg"         2
     * (First msg added to database earlier also time is an indicator of that)
     * Then this msg String part of the arrayList will be like this : ["abc","dfg"] which will be in this order and we can also print it
     * to the chat page like this since it is ordered already then their talkings will be ordered like this
     * User1      User2
     * "abc"
     *            "dfg"
     * So get row that contain both of the parameters, get the information then make an object out of it then add it to ArrayList
     * Then return it, it may work like this
     */
    public static ArrayList<Message> getChatMessages( int msgSenderId , int msgRecieverId ){

    }
    private static String getMessageMsg(){}
    private static String getMessageTime(){}
    private static long getMessageMilliseconds(){}

    /**
     * Look at Chat class and use constructor of other classes ( It may work maybe idk )
     */
    public static Chat getChat(){

    }
    private static long getChatTimeLeft(){}
    private static int getChatStatus(){}

    /**
     * This method may be get the Chats with userId so it may make sense maybe ? to add userId as parameter?
     * Then we will use ChatCollection's sort method to sort the chats
     */
    public static ArrayList<Chat> getChatList(){

    }

    /**
     * This might change aswell not still quite sure about this
     */
    public static ChatCollection getChatCollection(){

    }

    //After this add and update methods start I was not going to do them initally but then i decide i might just add it
    //So these might be more uncomplete then the first part
    /**
     * Probably others will be similar to this which obvious enough i guess
     */
    public static void addNewUserToDatabase( User user ){

    }
    public static void addNewNoticeToDatabase( Notice notice ){}

    /**
     * When you send message
     */
    public static void addNewMessageToDatabase( Message msg ){}

    /**
     * This makes sense to add when you contact someone
     */
    public static void addNewChatToDatabase( Chat chat ){}

    /**
     * Basically what i think is gets the user and the id of it and updates that row ( id's row ) with user objects properties
     * using get methods can be enough to this
     * But of course you know better if it is going to work like this
     */
    public static void updateUser( User user , int userId ){}

    public static void updateNotice( Notice notice, int noticeId ){}

    /**
     * Should update when someone send message
     * Maybe i send message then we add that message into the Chat object using Chat class methods then
     * we use this method to update chat table at database
     */
    public static void updateChat( Chat chat, int chatId){}

    /**
     * I am not sure about this if this make sense we may remove this
     */
    public static void updateChatCollection( ChatCollection list , int chatCollectionId )




}
