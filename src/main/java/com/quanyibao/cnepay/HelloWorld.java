package com.quanyibao.cnepay;

import com.quanyibao.cnepay.http.server.PayHttpHandler;

import org.webbitserver.WebServer;
import org.webbitserver.WebServers;

public class HelloWorld {

    public static void main(String args[]) throws Exception {

        WebServer webServer = WebServers.createWebServer(8087).add(new PayHttpHandler());
        webServer.start().get();
        System.out.println("Listening on " + webServer.getUri());
    }
}

