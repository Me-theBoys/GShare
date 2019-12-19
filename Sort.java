package Sort;

import Notice.Notice;
import User.User;
import Location.LocationG;
import java.util.ArrayList;

public class Sort {

    public static final int ALL = 0;
    public static final int EDUCATION = 1;
    public static final int ELECTRONIC = 2;
    public static final int TRANSPORT = 3;
    public static final int STATIONARY = 4;
    public static final int PET = 5;
    public static final int LECTURE_NOTES = 6;
    public static final int BOOKS = 7;
    public static final int OTHER = 8;

    public static ArrayList<Notice> sortByKeyWord ( ArrayList<Notice> noticeList , String keyWord , char noticeType ) {
        ArrayList<Notice> sortedList = new ArrayList<Notice>();

        if( noticeType == 'B'){
            noticeList = getBorrowings( noticeList );
        }
        if( noticeType == 'L'){
            noticeList = getLendings( noticeList );
        }
        for ( int i = 0 ; i < noticeList.size() ; i++ ) {
            if ( noticeList.get(i).getName().indexOf(keyWord) != -1 ) {
                sortedList.add(noticeList.get(i));
            }
        }

        return sortedList;
    }

    public static ArrayList<Notice> sortByCategory ( ArrayList<Notice> noticeList , int categoryType, char noticeType ) {
        ArrayList<Notice> sortedList = new ArrayList<Notice>();

        if( noticeType == 'B'){
            noticeList = getBorrowings( noticeList );
        }
        if( noticeType == 'L'){
            noticeList = getLendings( noticeList );
        }
        for ( int i = 0 ; i < noticeList.size() ; i++ ) {
            if ( noticeList.get(i).getCategory() == categoryType ) {
                sortedList.add(noticeList.get(i));
            }
        }

        return sortedList;
    }

    public static ArrayList<Notice> sortByGInterval ( ArrayList<Notice> noticeList , int startG , int endG  ) {
        ArrayList<Notice> sortedList = new ArrayList<Notice>();

        for ( int i = 0 ; i < noticeList.size() ; i++ ) {
            if ( noticeList.get(i).getG() <= endG && startG <= noticeList.get(i).getG() ) {
                sortedList.add(noticeList.get(i));
            }
        }

        return sortedList;
    }

    public static ArrayList<Notice> sortByDistance ( ArrayList<Notice> noticeList , User user , int interval, char noticeType ) {
        ArrayList<Notice> sortedList = new ArrayList<Notice>();

        if( noticeType == 'B'){
            noticeList = getBorrowings( noticeList );
        }
        if( noticeType == 'L'){
            noticeList = getLendings( noticeList );
        }
        for ( int i = 0 ; i < noticeList.size() ; i++ ) {
            if ( user.getLocation().distanceFrom(noticeList.get(i).getLocation()) <= interval ){
                sortedList.add(noticeList.get(i));
            }
        }

        for( int j = 0; j < noticeList.size(); j++ ) {
            int smallestPos = j;

            for (int i = j; i < noticeList.size(); i++) {
                if (user.getLocation().distanceFrom(noticeList.get(i).getLocation()) < user.getLocation().distanceFrom(noticeList.get(smallestPos).getLocation()))
                    smallestPos = i;
            }

            Notice temp = noticeList.get(smallestPos);
            noticeList.set( smallestPos, noticeList.get(j) );
            noticeList.set( j , temp );

        }


        return sortedList;
    }

    public static ArrayList<Notice> sortByBookmark ( ArrayList<Notice> noticeList , User user, char noticeType ) {
        ArrayList<Notice> sortedList = new ArrayList<Notice>();

        if( noticeType == 'B'){
            noticeList = getBorrowings( noticeList );
        }
        if( noticeType == 'L'){
            noticeList = getLendings( noticeList );
        }
        for ( int i = 0 ; i < noticeList.size() ; i++ ) {
            for (int j = 0; j < user.getBookmarkList().size(); j++) {
                if (noticeList.get( i ).getNoticeOwner().equals(user.getBookmarkList().get( j ) ) ) {
                    sortedList.add( noticeList.get( i ) );
                }
            }
        }

        return sortedList;
    }

    public static ArrayList<Notice> sortByLexiography ( ArrayList<Notice> noticeList, char noticeType ) {

        if( noticeType == 'B'){
            noticeList = getBorrowings( noticeList );
        }
        if( noticeType == 'L'){
            noticeList = getLendings( noticeList );
        }

        for ( int i = 0 ; i < noticeList.size() ; i++ ) {
            int smallestIndex = i;

            for ( int j = i ; i < noticeList.size() ; j++ ) {
                if ( noticeList.get(smallestIndex).getName().compareTo(noticeList.get(j).getName()) > 0 ) {
                    smallestIndex = j;
                }
            }

            System.out.println(smallestIndex);
            Notice temp = noticeList.get(smallestIndex);
            noticeList.set( smallestIndex , noticeList.get(i) );
            noticeList.set(i , temp);
        }
        return noticeList;
    }

    public static ArrayList<Notice> sortByPostTime ( ArrayList<Notice> noticeList, char noticeType ){

        if( noticeType == 'B'){
            noticeList = getBorrowings( noticeList );
        }
        if( noticeType == 'L'){
            noticeList = getLendings( noticeList );
        }
        for ( int i = 0 ; i < noticeList.size() ; i++ ) {
            int smallestIndex = i;

            for (int j = i; i < noticeList.size(); j++) {
                if (noticeList.get(smallestIndex).getPostingTime() > noticeList.get(j).getPostingTime()) {
                    smallestIndex = j;
                }
            }

            Notice temp = noticeList.get( smallestIndex );
            noticeList.set(smallestIndex, noticeList.get(i));
            noticeList.set(i, temp);
        }
        return noticeList;
    }

    public static ArrayList< Notice > getLendings( ArrayList<Notice> noticeList ){
        ArrayList< Notice > sortedList = new ArrayList<Notice>();

        for( int i = 0; i < noticeList.size(); i++ ){
            if( noticeList.get(i).getNoticeType() == Notice.LEND_NOTICE){
                sortedList.add( noticeList.get(i) );
            }
        }
        return sortedList;

    }
    public static ArrayList< Notice > getBorrowings( ArrayList<Notice> noticeList ){
        ArrayList< Notice > sortedList = new ArrayList<Notice>();

        for( int i = 0; i < noticeList.size(); i++ ){
            if( noticeList.get(i).getNoticeType() == Notice.BORROW_NOTICE){
                sortedList.add( noticeList.get(i) );
            }
        }
        return sortedList;

    }



}
