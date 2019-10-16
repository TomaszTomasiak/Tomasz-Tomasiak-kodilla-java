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

        if (numberOfComments != 0 && numberOfUsers != 0) {
            averageNumberOfCommentsPerUser = numberOfComments / numberOfPosts;
            averageNumberOfCommentsPerPost = 0;
            averageNumberOfPostsPerUser = 0;

        } else if (numberOfPosts != 0 && numberOfUsers != 0) {
            averageNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
            averageNumberOfCommentsPerPost = 0;
            averageNumberOfCommentsPerPost = 0;

        } else if (numberOfPosts != 0 && numberOfComments != 0) {
            averageNumberOfPostsPerUser = 0;
            averageNumberOfCommentsPerUser = 0;
            averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;

        } else if (numberOfUsers != 0 && numberOfComments != 0 && numberOfPosts != 0){
            averageNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
            averageNumberOfCommentsPerUser = numberOfComments / numberOfPosts;
            averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;

        } else {
            averageNumberOfPostsPerUser = 0;
            averageNumberOfCommentsPerUser = 0;
            averageNumberOfCommentsPerPost = 0;
        }
    }

    public String showStatistics() {

        //String tmp = numberOfUsers + ", " + numberOfPosts + ", " + numberOfComments;
        return "";
    }

}
