/*
 * Copyright (c) 2017 Team 24,CMPUT301, University of Alberta - All Rights Reserved.
 * You mayuse,distribute, or modify thid code under terms and condition of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact xuanyi@ualberta.ca.
 *
 */

package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by XuanyiWu on 2017-10-11.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }


    ///////////////////////// the test cases are independent ///////////////////


    public void testAddTweet(){
        // assertTrue(Boolean.FALSE);   this test is supposed to fail
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
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
        Tweet tweet  = new NormalTweet("test");
        list.add(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage() );
    }



////////////////////////////////////////////////////////////////////////////////
    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        int returnedCount =tweets.getCount();
        assertEquals( returnedCount, 1);

    }


}
