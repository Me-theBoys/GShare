public class BookmarkQuest extends Quest {


    public BookmarkQuest( int badge , int price , String description , int total , int progress ) {
        super( badge , price ,description , total , progress );
    }

    public void checkProgress( User user ) {
        int size = user.getBookmarkList().size();
        setProgress( size );
    }

}
