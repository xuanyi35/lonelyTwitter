/*
 * Tweet
 *
 * Version 1.0
 *
 * September 27,2017
 *
 * Copyright (c) 2017 Team X,CMPUT301, University of Alberta - All Rights Reserved.
 * You may use,distribute, or modify thid code under terms and condition of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xuanyi on 9/13/17.
 */




/**
 *
 * Represents an Important Tweet
 * @author X
 * @version 1.5
 * @since 1.0
 * @see Tweet
 * @see ImportantTweet
 * @since 1.0
 */

public class NormalTweet extends Tweet{
    /**
     * construct a Normal Tweet Object
     *
     * @param message normal tweet message
     */
    public NormalTweet(String message){
        super(message);
    }

    /**
     * Construct a Normal Tweet Object
     *
     * @param message normal tweet message
     * @param date normal tweet date
     */
    public NormalTweet(String message,Date date){
        super(message, date);
    }

    /**
     * return false to show that the tweet is not important
     * @return
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }


}
