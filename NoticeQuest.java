public class NoticeQuest extends Quest {

    public final static int lendQuest = 0;
    public final static int borrowQuest = 1;
    public static final int bothQuest = 2;

    public NoticeQuest( int badge , int price , String description , int total , int progress ) {
        super( badge , price ,description , total , progress );
    }

    public void checkProgress( User user, int questType ) {
        int lend = user.getNumberOfLendNotices();
        int borrow = user.getNumberOfBorrowNotices();
        if( questType == lendQuest ) {
            setProgress( lend );
        }
        if ( questType == borrowQuest ) {
            setProgress( borrow );
        }
        if ( questType == bothQuest ) {
            setProgress( borrow + lend );
        }
    }




}
