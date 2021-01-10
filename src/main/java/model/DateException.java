/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Exception class thrown when date is no t correct
 *
 * @author Szymon Godziński
 * @version 1.2
 */
public class DateException extends Exception {

    /**
     * Default constructor
     */
    public DateException() {
        super();
    }

    /**
     * Constructor with message
     *
     * @param message message of exception
     */
    public DateException(String message) {
        super(message);
    }
}
