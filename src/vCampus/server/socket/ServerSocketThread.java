package vCampus.server.socket;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.security.Policy.Parameters;
import java.util.ArrayList;
import java.util.Collection;

import vCampus.client.biz.StudentService;
import vCampus.client.biz.StudentServiceImpl;
import vCampus.server.biz.StudentServiceDao;
import vCampus.server.biz.StudentServiceDaoImpl;
import vCampus.server.exception.RecordNotFoundException;
import vCampus.server.exception.WrongPasswordException;
import vCampus.util.Message;
import vCampus.vo.Student;

/**
 * @author SongZixing
 *
 * @version 0.0
 * 
 */
public class ServerSocketThread extends Thread{

	private Socket clientSocket;
	
	public ServerSocketThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.clientSocket = socket;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream message = new ObjectInputStream(new BufferedInputStream(clientSocket.getInputStream()));
			Message object = (Message)message.readObject();
            System.out.println("已接收到客户端连接"+ ",当前客户端ip为："
                    + clientSocket.getInetAddress().getHostAddress());
            System.out.println(object.getMessageType());
          
            
            if(object.getMessageType() == "STUDENT_LOGIN") {
            	Message serverResponse = new Message();
            	try {
            		StudentServiceDao studentServiceDao = new StudentServiceDaoImpl();
            		Student foundStudent = studentServiceDao.login(object.getLoginAccount(), object.getLoginPassword());
            		serverResponse.setStudentUser(foundStudent);
            	}
            	catch (RecordNotFoundException e) {
					// TODO: handle exception
            		serverResponse.setExceptionCode("RecordNotFoundException");
				}
            	catch (WrongPasswordException e) {
					// TODO: handle exception
            		serverResponse.setExceptionCode("WrongPasswordException");
				}
            	ObjectOutputStream response = new ObjectOutputStream(clientSocket.getOutputStream());
            	response.writeObject(serverResponse);
            	
            }
          
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
