package User;

import Location.LocationG;
import java.util.ArrayList;
import java.util.Objects;
import Quest.*;

public class User {
    private String userName;
    private String password;
    private String email;
    private LocationG location;
    private long creditCardNumber;
    private int g;
    private String name;
    private String surname;
    private double lenderRating;
    private double borrowerRating;
    private int numberOfLendRates;
    private int numberOfBorrowRates;
    private int numberOfLends;
    private int numberOfBorrows;
    private int activeGAmount;//TESTED AND WORKS
    private ArrayList<Quest> questsToDisplay;
    private ArrayList<User> bookmarkList;
    private QuestCollection allQuests;
    //Only for quests
    private int fiveStarLendingRates;
    private int fiveStarBorrowinRates;
    private boolean firstPost; //Only for lending

    public User( String name, String surname, String userName, String password, String email, int g ) {
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.location = getLocation();
        this.g = g;
        activeGAmount = 0;
        firstPost = true;
        bookmarkList = new ArrayList<User>();
        questsToDisplay = new ArrayList<Quest>();
    }
    public void deposit( int g ){
        this.g = this.g + g;
    }
    public void withdraw( int g ){
        if( g > this.g ){
            throw new IllegalArgumentException( "G is too high!" );
        }
        else{
            this.g = this.g - g;
        }
    }

    public double getLenderRating() {
        return lenderRating;
    }

    /*
    PLEASE DONT USE THIS ONLY FOR DATABASE USING
      */
    public void setLenderRating(double lenderRating) {
        this.lenderRating = lenderRating;
    }

    public double getBorrowerRating() {
        return borrowerRating;
    }

    /*
    PLEASE DONT USE THIS ONLY FOR DATABASE USING
     */
    public void setBorrowerRating(double borrowerRating) {
        this.borrowerRating = borrowerRating;
    }

    public int getNumberOfLendRates(){
        return numberOfLendRates;
    }
    /*
    PLEASE DONT USE THIS ONLY FOR DATABASE USING
     */
    public void setNumberOfLendRates(int numberOfLends) {
        this.numberOfLendRates = numberOfLends;
    }

    public int getNumberOfBorrowRates() {
        return numberOfBorrowRates;
    }
    /*
    PLEASE DONT USE THIS ONLY FOR DATABASE USING
     */
    public void setNumberOfBorrowRates(int numberOfBorrows ) {
        this.numberOfBorrowRates = numberOfBorrows;
    }

    public void addActiveDealGAmount(int g ){
        this.activeGAmount += g;
    }

    public int getActiveDealGAmount(){
        return activeGAmount;
    }
    public int getG(){
        return g;
    }

    public void computeAverageLendRate( int lendRate ){//TESTED AND WORKS
        lenderRating = ( ( lenderRating * numberOfLendRates ) + lendRate ) / ( numberOfLendRates + 1 );
        numberOfLendRates++;
    }

    public void computeAverageBorrowRate( int borrowRate ){//TESTED AND WORKS
        borrowerRating = ( ( borrowerRating * numberOfBorrowRates ) + borrowRate ) / ( numberOfBorrowRates + 1 );
        numberOfBorrowRates++;
    }

    public void updateLocation(){
        location = new LocationG();
    }

    public LocationG getLocation(){
        updateLocation();
        return location;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail(){
        return email;
    }
    public String getUserName(){
        return userName;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public long getCreditCardNumber(){
        return creditCardNumber;
    }
    public void setCreditCardNumber( long creditCardNumber ){
        this.creditCardNumber = creditCardNumber;
    }
    /*
    PLEASE DONT USE THIS DATABASE USE ONLY
     */
    public void setActiveGAmount( int g ){
        this.activeGAmount = g;
    }
    public int getFiveStarLendingRates() {
        return fiveStarLendingRates;
    }

    public void setFiveStarLendingRates(int fiveStarLendingRates) {
        this.fiveStarLendingRates = fiveStarLendingRates;
    }

    public int getFiveStarBorrowinRates() {
        return fiveStarBorrowinRates;
    }

    public void setFiveStarBorrowinRates(int fiveStarBorrowinRates) {
        this.fiveStarBorrowinRates = fiveStarBorrowinRates;
    }
    public int getNumberOfLends() {
        return numberOfLends;
    }

    public void setNumberOfLends(int numberOfLends) {
        this.numberOfLends = numberOfLends;
    }

    public int getNumberOfBorrows() {
        return numberOfBorrows;
    }

    public void setNumberOfBorrows(int numberOfBorrows) {
        this.numberOfBorrows = numberOfBorrows;
    }
    public ArrayList<User> getBookmarkList(){
        return bookmarkList;
    }
    /*
    ONLY FOR DATABASE USAGE
     */
    public void setBookmarkList( ArrayList<User> list ){
        bookmarkList = list;
    }
    public void setQuestsToDisplay( Quest q1, Quest q2, Quest q3, Quest q4, Quest q5 ){
        ArrayList<Quest> list = new ArrayList<Quest>();
        list.add(q1);
        list.add(q2);
        list.add(q3);
        list.add(q4);
        list.add(q5);
        questsToDisplay = list;
    }
    public ArrayList<Quest> getQuestsToDisplay(){
        return questsToDisplay;
    }
    public QuestCollection getAllQuests() {
        return allQuests;
    }

    public boolean isFirstPost() {
        return firstPost;
    }

    public void setFirstPost(boolean firstPost) {
        this.firstPost = firstPost;
    }

    /**
     * Only for arrayList usage not really important for now
     */
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return user.getUserName().equals( this.getUserName() );
    }
}
