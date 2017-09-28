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
 * @see NormalTweet
 * @since 1.0
 */


public class ImportantTweet extends Tweet {
    /**
     *  construct an Important tweet object
     *
     * @param message important tweet message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Construct an Important tweet object
     *
     * @param message important tweet message
     * @param date important tweet date
     */
    public ImportantTweet(String message, Date date){
        super(message, date);

    }

    /**
     * return true to show that the tweet is important
     *
     * @return
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
