package Models;

import com.orm.SugarRecord;

/**
 * Created by Syed Zain UL Hasan on 09/07/2016.
 */
public class Note extends SugarRecord {

    private String task;



    public Note(){}

    public Note(String task) {
        this.task = task;

    }


    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return task;
    }
}
