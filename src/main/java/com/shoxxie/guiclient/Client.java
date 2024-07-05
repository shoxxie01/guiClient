package com.shoxxie.guiclient;

import java.io.*;
import java.net.Socket;

public class Client implements Runnable{

    private Socket socket;
    private BufferedWriter writer;
    private BufferedReader reader;
    private HelloController controller;


    public Client() throws IOException {
        this.socket = new Socket("localhost", 1234);
        this.writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.controller = controller;
    }

    @Override
    public void run() {

    }

    public static void main(String[] args) {

    }
}
