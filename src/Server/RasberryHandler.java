/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author Vimukthi Weerasiri
 */
public class RasberryHandler {

    private static RasberryHandler rasberryHandler;

    private RasberryHandler() {

    }

    public RasberryHandler getInstance() {
        if (rasberryHandler == null) {
            return rasberryHandler;
        }
        return rasberryHandler;
    }

}
