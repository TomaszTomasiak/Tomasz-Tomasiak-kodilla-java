package com.kodilla.testing.forum.statistics;
import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.ForumStatistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics(Statistics statistics){

        Statistics statisticksMock = mock(Statistics.class);

        when(statisticksMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticksMock.postsCount()).thenReturn(0);
        when(statisticksMock.commentsCount()).thenReturn(0);


        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticksMock);

        Assert.assertEquals(5.0, forumStatistics.getAverageNumberOfCommentsPerPost(),0.1);

    }
}
