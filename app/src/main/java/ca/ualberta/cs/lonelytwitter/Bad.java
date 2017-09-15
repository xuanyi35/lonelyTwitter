package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by XuanyiWu on 2017-09-14.
 */

public class Bad extends Mood {

    public Bad(String mood){
        super(mood);
    }

    public Bad (String mood, Date date){
        super(mood,date);
    }

    @Override
    public Boolean isGood(){
        return Boolean.FALSE;
    }


}
