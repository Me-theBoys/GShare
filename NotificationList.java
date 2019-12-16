public class NotificationList{
  private ArrayList<Notification> notifications;
  
  
  public NotificationList(){
    notifications = new ArrayList<Notification>();
  }
  
  public void addNotification(Notification notification){
    this.notifications.add(notification);
  }
  public void deleteNotification(Notification notification){
    notifications.remove(notifications.lastIndexOf(notification));
  }
  public ArrayList<Notification> getNotifications(){
  return notifications;
  }
  
  
  
  
  





}