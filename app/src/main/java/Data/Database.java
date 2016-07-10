package Data;

import java.util.ArrayList;
import java.util.List;

import Models.Note;

/**
 * Created by Syed Zain UL Hasan on 09/07/2016.
 */
public class Database {

    public  static List<Note> notes=new  ArrayList<>();

    public static List<Note> getData()
    {
        notes.add(new Note("Do books"));


     return notes;
    }


    public static void addData(String n)
    {

        notes.add(new Note(n));

    }




}
