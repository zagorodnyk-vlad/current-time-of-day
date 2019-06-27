/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zagorodnyk.zagorodnyk;

import org.apache.log4j.BasicConfigurator;

public class Time {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        CurrentDate date = new CurrentDate();
        date.date();
    }
}
