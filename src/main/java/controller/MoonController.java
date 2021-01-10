/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDate;
import model.DateException;
import model.Moon;
import model.PhaseException;

/**
 * Controller between View and model
 *
 * @author Szymon Godziński
 * @version 1.2
 */
public class MoonController {

    /**
     * Function calculate phase of moon
     * 
     * @param date date
     * @return phase of moon
     * @throws PhaseException if phase is above 1 or below 0
     * @throws DateException if date is not correct
     */
    public double calculatePhase(LocalDate date) throws PhaseException, DateException {
        /**
         * Object moon represents Moon class to calculate phase of moon
         */
        Moon moon = new Moon();

        return moon.calculatePhaseOfMoon(date);
    }

    /**
     * Check if dateString is date, if dateString is date processes her to LocalDate
     * object, if dateString isn't date program throw exception
     * 
     * @param dateString Date as string
     * @return LocalDate object selected by user
     * @throws DateException if date is not correct
     */
    public LocalDate getDate(String dateString) throws DateException {

        /**
         * Array of string represents date,index 0=year 1=month 2=day
         */
        String[] dateAsStringArray = dateString.split(" ");
        /**
         * Object localDate represents processes date
         */
        LocalDate localDate;

        /**
         * Objects represents date
         */
        int day, month, year;

        //dateAsStringArray = dateString.split(" ");
        if (dateAsStringArray.length < 3) {
            throw new DateException("Date have less than three numbers");
        }

        if (!validateInt(dateAsStringArray)) {
            throw new DateException("Date have invalid data type");
        }

        year = Integer.parseInt(dateAsStringArray[0]);
        month = Integer.parseInt(dateAsStringArray[1]);
        day = Integer.parseInt(dateAsStringArray[2]);

        if (!validateDate(year, month, day)) {
            throw new DateException("Date have value out of range of calendar");
        }

        localDate = LocalDate.of(year, month, day);

        return localDate;
    }

    /**
     * Function check whether imput strings are numeral decimal
     *
     * @param args strings to check
     * @return false if strings isn't numeral decimal or true if strings is
     * decimal
     */
    private boolean validateInt(String... args) {
        for (String tmp : args) {
            if (!tmp.matches("\\d+")) {
                return false;
            }
        }
        return true;
    }

    /**
     * Function check whether imput arguments can create date
     *
     * @param year year
     * @param month month
     * @param day day
     * @return true if date can be created or false if can't be
     */
    private boolean validateDate(int year, int month, int day) {

        BooleanFunctionalInterface checkDayOfMonth
                = (maxDays) -> {
                    return maxDays >= day;
                };

        switch (month) {
            case 1:
                return checkDayOfMonth.check(31);
            case 2:
                if (year != 0 && year % 4 == 0) {
                    return checkDayOfMonth.check(29);
                } else {
                    return checkDayOfMonth.check(28);
                }
            case 3:
                return checkDayOfMonth.check(31);
            case 4:
                return checkDayOfMonth.check(30);
            case 5:
                return checkDayOfMonth.check(31);
            case 6:
                return checkDayOfMonth.check(30);
            case 7:
                return checkDayOfMonth.check(31);
            case 8:
                return checkDayOfMonth.check(31);
            case 9:
                return checkDayOfMonth.check(30);
            case 10:
                return checkDayOfMonth.check(31);
            case 11:
                return checkDayOfMonth.check(30);
            case 12:
                return checkDayOfMonth.check(31);
        }
        return false;
    }

}
