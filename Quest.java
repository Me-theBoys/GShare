public abstract class Quest {

    private int badge;
    private int price;
    private String description;
    private int total;
    private int progress;
    private boolean completed;

    public Quest( int badge , int price , String description , int total , int progress ) {
        this.badge = badge;
        this.price = price;
        this.description = description;
        this.total = total;
        this.progress = progress;
        completed = isCompleted();
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getBadge() {
        return badge;
    }

    public int getTotal() {
        return total;
    }

    private void setCompleted() {
        if ( progress < total ) {
            completed = false;
        }
        else {
            completed = true;
        }
    }

    public boolean isCompleted() {
        setCompleted();
        return completed;
    }

    public int getProgress() {
        return progress;
    }

    public void addProgress( int addint ) {
        if (!completed) {
            if ( progress > total ) {
                progress = total;
            } else {
                progress = progress + addint;
            }
        }
        setCompleted();
    }

    public void setProgress( int setint ) {
        progress = setint;
        if ( progress > total ) {
            progress = total;
        }
        setCompleted();
    }




}
