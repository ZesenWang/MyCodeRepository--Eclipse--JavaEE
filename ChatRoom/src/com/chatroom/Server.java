package com.chatroom;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class server
 */
public class Server extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Server() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		OutputStream out = response.getOutputStream();
		out.write("hello from server".getBytes());
		
		InputStream in = request.getInputStream();
		//read a message from client side
		new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    byte[] buff = new byte[100];
                    while (in.read(buff) != -1){
                        System.out.println(new String(buff));
                        buff = new byte[100];
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
		
		//send a message to client side
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try{
                        byte[] buff;
                        Scanner scanner = new Scanner(System.in);
                        String message = scanner.nextLine();

                        buff = message.getBytes();
                        out.write(buff);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        
        while(true);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
