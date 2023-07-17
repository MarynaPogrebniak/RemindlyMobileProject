package com.remindly.tests;

import data.RemindlyData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReminderTests extends TestBase{

    @Test
    public void addReminderPositiveTest() {

        // tap on add reminder
        app.getMainScreen().tapOnAddReminder();

        // enter title
        app.getReminder().enterTitle(RemindlyData.TEXT);

       /* app.getReminder().addAllData(RemindlyData.PERIOD, RemindlyData.MONTH, RemindlyData.NUMBER,
                RemindlyData.INDEX, RemindlyData.PERIOD2, RemindlyData.YEAR, RemindlyData.TIME_OF_DAY,
                RemindlyData.X_OUR, RemindlyData.Y_OUR, RemindlyData.X_MIN, RemindlyData.Y_MIN,
                RemindlyData.REPEAT, RemindlyData.TYPE_OF_REP);

        */

        // tap on date field
        app.getReminder().tapOnDateField();

        // swipe to month
        app.getReminder().swipeToMonth(RemindlyData.PERIOD, RemindlyData.MONTH, RemindlyData.NUMBER);

        // select date
        app.getReminder().selectDate(RemindlyData.INDEX);

        // tap on year
        app.getReminder().tapOnYear();

        // swipe to year
        app.getReminder().swipeToYear(RemindlyData.PERIOD2, RemindlyData.YEAR);

        // tap on OK
        app.getReminder().tapOnOk();

        // tap on time field
        app.getReminder().tapOnTimeField();

        // select time
        app.getReminder().selectTime(RemindlyData.TIME_OF_DAY, RemindlyData.X_OUR, RemindlyData.Y_OUR, RemindlyData.X_MIN, RemindlyData.Y_MIN);

        // tap on OK
        app.getReminder().tapOnOk();

        // tap on repetition interval id - RepeatNo
        app.getReminder().tapOnRepetitionInterval();

        // define repetition
        app.getReminder().defineRepetition(RemindlyData.REPEAT);

        // swipe up
        app.getReminder().swipe(RemindlyData.SWIPE_START, RemindlyData.SWIPE_STOP);

        // tap on type of repetition id - RepeatType
        app.getReminder().tapOnTypeOfRepetition();

        // select type of repetition
        app.getReminder().selectTypeOfRepetition(RemindlyData.TYPE_OF_REP);

        // save reminder
        app.getReminder().saveReminder();

        // assert by title id recycle_title
        Assert.assertTrue(app.getMainScreen().isReminderTitlePresent().contains("Holiday"));
    }
}
