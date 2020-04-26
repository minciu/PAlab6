/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapplication;

import java.io.*;
import java.net.*;



public class GameServer {
 // Define the port on which the server is listening
 public static final int PORT = 8100;
 public GameServer() throws IOException {
 ServerSocket serverSocket = null ;
 try {
 serverSocket = new ServerSocket(PORT);
 while (true) {
 System.out.println ("Waiting for a client ...");
 Socket socket = serverSocket.accept();
 
 
 // Execute the client's request in a new thread
 
 new ClientThread(socket).start();
 
 }
 } catch (IOException e) {
 System.err. println ("Ooops... " + e);
 } finally {
 serverSocket.close();
 }
 }
 
}

