package com.kodilla.testing.forum.statistics;

import java.util.*;

public class ForumStatistics {

    Statistics statistics;
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averageNumberOfPostsPerUser;
    double averageNumberOfCommentsPerUser;
    double averageNumberOfCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averageNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
        averageNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;


    }

    public String showStatistics() {

        //String tmp = numberOfUsers + ", " + numberOfPosts + ", " + numberOfComments;
        return null;
    }

}
