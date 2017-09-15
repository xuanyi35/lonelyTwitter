package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by XuanyiWu on 2017-09-14.
 */

public class Good extends Mood {
    public Good(String mood){
        super(mood);
    }

    public Good (String mood, Date date){
        super(mood,date);
    }

    @Override
    public Boolean isGood(){
        return Boolean.TRUE;
    }

}
