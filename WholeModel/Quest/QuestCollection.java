package Quest;

import java.util.ArrayList;

public class QuestCollection {

    private ArrayList<Quest> questList;

    public QuestCollection( ArrayList<Quest> questList ) {
        this.questList = questList;
    }

    public ArrayList<Quest> getAllQuests() {
        return questList;
    }

    public Quest getQuest( int index ) {
        return questList.get( index );
    }

    public void addNewQuest( Quest q ) {
        questList.add(q);
    }

    public void sortQuestCollection() {
        int count = 0;

        for ( int i = 0 ; i < questList.size() ; i++ ) {
            if ( !questList.get(i).isCompleted() ) {
                count++;
            }
        }

        for ( int i = 0 ; i < count ; i++ ) {
            if ( questList.get(i).isCompleted() ) {
                questList.add( questList.get(i) );
                questList.remove(i);
            }
        }

    }
    /*
    public static QuestCollection getQuestCollection(){

    }
    */

}