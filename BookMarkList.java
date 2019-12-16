/**
 * 
 * 
 */
public class BookMarkList{
  private ArrayList<Profile> bookMarkList;
  public BookMarkList(){
    bookMarkList = new ArrayList<Profile>();
  }
  public void addBookMarkList(Profile profile){
    this.bookMarkList.add(profile);
  }
  public void deleteBookMarkList(Profile profile){
    this.bookMarkList.remove(bookMarkList.lastIndexOf(profile));
  }
  public ArrayList<Profile> getBookMarkList(){
    return bookMarkList;
  }
  public Profile getBookMark(int index){
    return bookMarkList.get(index);
  }
}