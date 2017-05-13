import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SayHello {
	public static void main(String[] args){
		try {
			ServerSocket ss = new ServerSocket(8080);
			Socket connection = ss.accept();
			OutputStream os = connection.getOutputStream();
			Writer out = new OutputStreamWriter(os, "utf-8");
			Date now = new Date();
			out.write(now.toString() + "\r\n");
			
			out.flush();
			connection.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
