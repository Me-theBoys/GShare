/**
 * 
 * 
 */
public class BookMarkList{
  private ArrayList<User> bookMarkList;
  public BookMarkList(){
    bookMarkList = new ArrayList<User>();
  }
  public void addBookMarkList(User user){
    this.bookMarkList.add(user);
  }
  public void deleteBookMarkList(User user){
    this.bookMarkList.remove(bookMarkList.lastIndexOf(user));
  }
  public ArrayList<User> getBookMarkList(){
    return bookMarkList;
  }
  public User getBookMark(int index){
    return bookMarkList.get(index);
  }
}
