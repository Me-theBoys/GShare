/**
 * The ChatCollection class that have a collection of chats to alter.
 * 
 * @date 15.12.2019
 */
public class ChatCollection {
  
  public ArrayList<Chat> chatList;
  
  
  /**
   * The constructor of the ChatCollection class.
   */
  public ChatCollection() {
    chatList = new ArrayList<Chat>();
  }
  
  /**
   * This method adds a new chat to the chat list.
   * 
   * @param chat a new chat to add.
   */
  public void addChat( Chat chat ) {
    chatList.add( chat );
  }
  
  /**
   * This method gets all chats as an arraylist.
   * 
   * @return chatList the list of chats as an arrayList.
   */
  public ArrayList<Chat> getAllChat() {
    return chatList;
  }
  
  /**
   * This method gets a specified chat.
   * 
   * @param index the specified index.
   * @return chatList.get( index ) 
   */
  public Chat getChat( int index ) {
    return chatList.get( index );
  }
  
  /**
   * This method deletes a specified chat.
   * 
   * @param index the specified index.
   * @return chat the chat that have deleted.
   */
  public Chat deleteChat( int index ) {
    Chat chat = chatList.get( index );
    chatList.delete( index );
    return chat;
  }
  
  /**
   * This method sorts the chats based on the latest converstaion at the top of the list.
   */
  public void sortChat() {
    
  }
  
  
  
}
