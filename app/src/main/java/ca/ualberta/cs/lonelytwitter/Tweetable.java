/*
*Tweetable
*
* Version 1.0
*
* September 27, 2017
*
*Copyright © 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
*You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
*You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
*/

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Checks length of tweet to see if it is no more than 140 characters
 */
public interface Tweetable {
    // return tweet message
    public String getMessage();
    public Date getDate();
}
