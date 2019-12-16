public class Notification{
  private String message;
  private boolean canDelete;
  private BufferedImage icon;
  public Notification(int i, Notice notice){
    if(i == 0){
      message = "1 day left to return " + notice.getName();
      canDelete = false;
      icon =
        
        
    }else if(i == 1){
      message = "2 day left to  return " + notice.getName();
      canDelete = true;
      icon = 
        
        
      }
  }
    public Notification(int i, Profile profile){
      if(i == 0){
        message = profile.getName() + " " + profile.getSurname() + " has evaluated you";
        canDelete = true;
        icon = 
          
          
          
      }else if(i == 1){
        message = "You have agreed with " + profile.getName() + " " + profile.getSurname();
        canDelete = true;
        icon = 
          
          
        }
    }
    public Sting getMessage(){
      return message;
    }
    public boolean getCanDelete(){
      return canDelete;
    }
    public BufferedImage getIcon(){
      return icon;
    }
  }



