/*
 * Copyright (c) 2017 Team 24,CMPUT301, University of Alberta - All Rights Reserved.
 * You mayuse,distribute, or modify thid code under terms and condition of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact xuanyi@ualberta.ca.
 *
 */

package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import java.util.Collections;

/**
 * Created by XuanyiWu on 2017-10-11.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }


    ///////////////////////// the test cases are independent ///////////////////


    public void testAddTweet(){
        boolean thrown  = false;
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

        Tweet tweet1 = new NormalTweet("adding tweet");
        if (tweets.check_dup(tweet1)) {
            try {
                throw new IllegalArgumentException("Duplicate tweet");
            } catch(IllegalArgumentException e) {
                thrown = true;
                assertTrue(thrown);
            }
        }
        else{
            tweets.add(tweet1);
            assertTrue(tweets.hasTweet(tweet1));
        }
    }

    public void testDelete(){
        // assertTrue(Boolean.FALSE);     this test is supposed to fail
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));        // this should pass as well since we assertFalse
    }

    public void testHasTweet(){

        TweetList list =  new TweetList();
        Tweet tweet  = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));        // this test is supposed to True
    }


    public void testGetTweet(){
        TweetList list = new TweetList();
        Tweet tweet1  = new NormalTweet("test 1");
        list.add(tweet1);
        Tweet tweet2  = new NormalTweet("test 2");
        list.add(tweet2);
        Tweet tweet3  = new NormalTweet("test 3");
        list.add(tweet3);

        list.reversedList();

        Tweet returnedTweet_latest = list.getTweet(0);
        assertEquals(returnedTweet_latest.getMessage(), tweet3.getMessage() );
        Tweet returnedTweet_oldest = list.getTweet(2);
        assertEquals(returnedTweet_oldest.getMessage(), tweet1.getMessage() );
    }



////////////////////////////////////////////////////////////////////////////////
    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        Tweet tweet1 = new NormalTweet("test 1");
        tweets.add(tweet1);
        int returnedCount =tweets.getCount();
        assertEquals( returnedCount, 2);

    }


}
