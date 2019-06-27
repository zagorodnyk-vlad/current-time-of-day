/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zagorodnyk.zagorodnyk;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Logger;

public class CurrentDate {

    static Logger logger = Logger.getLogger(CurrentDate.class);
    private final double MORNING_START = 6.01;
    private final double MORNING_FINISH = 9.00;
    private final double DAY_START = 9.01;
    private final double DAY_FINISH = 19.00;
    private final double EVENING_START = 19.01;
    private final double EVENING_FINISH = 23.00;
    private final double NIGHT_START = 23.01;
    private final double NIGHT_FINISH = 6.00;

    public Double date() {
        DateFormat dateFormat = new SimpleDateFormat("HH.mm");
        Date date = new Date();
        double value = Double.parseDouble(dateFormat.format(date));
        Locale currentLocale = Locale.getDefault();
        current(value, currentLocale);
        return value;
    }

    public String current(double value, Locale currentLocale) {
        String answer = "";
        if (value >= MORNING_START && value <= MORNING_FINISH) {
            answer = new PropertyValue("morning", currentLocale).getPropValues();
        }
        if (value >= DAY_START && value <= DAY_FINISH) {
            answer = new PropertyValue("day", currentLocale).getPropValues();
        }
        if (value >= EVENING_START && value <= EVENING_FINISH) {
            answer = new PropertyValue("evening", currentLocale).getPropValues();
        }
        if (value >= NIGHT_START) {
            answer = new PropertyValue("night", currentLocale).getPropValues();
        }
        if (value <= NIGHT_FINISH) {
            answer = new PropertyValue("night", currentLocale).getPropValues();
        }
        logger.debug(answer);
        System.out.println(answer);
        return answer;
    }
}
