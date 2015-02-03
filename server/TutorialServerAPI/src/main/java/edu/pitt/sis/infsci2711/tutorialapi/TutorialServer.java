/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.sis.infsci2711.tutorialapi;

import edu.pitt.sis.infsci2711.multidbs.utils.JerseyJettyServer;

/**
 *
 * @author yanyanzhou
 */
public class TutorialServer {

    public static void main(final String[] args) throws Exception {
        JerseyJettyServer server = new JerseyJettyServer(7654, "edu.pitt.sis.infsci2711.tutorialapi.rest");
        server.start();
    }
}
