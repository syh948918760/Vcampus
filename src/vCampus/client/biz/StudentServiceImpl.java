package vCampus.client.biz;

import java.util.ArrayList;
import java.util.Collection;

import vCampus.client.socket.Client;
import vCampus.util.Message;
import vCampus.util.MessageTypeCodes;

/**
 * @author SongZixing
 * 
 * @version 0.0
 * 
 * This is the implement for StudentService
 *
 */
public class StudentServiceImpl implements StudentService{
	
	private Client client;
	private String serviceName;
	
	/**
	 * @param
	 * 
	 */
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
		serviceName = "StudentService";
	}
	

	/* (non-Javadoc)
	 * @see vCampus.client.biz.StudentService#login(int, java.lang.String)
	 */
	@Override
	public boolean login(String studentID, String studentPassword) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setUserType("STUDENT");
		ArrayList<Object> data = new ArrayList<Object>();
		data.add(studentID);
		data.add(studentPassword);
		message.setData(data);
		message.setMessageType(MessageTypeCodes.studentLogin);
		Message serverResponse = client.sendRequestToServer(message);
		
		if(serverResponse.getStudentUser()!= null)
		{
			System.out.println(serverResponse.getStudentUser().getStudentName());
			return true;
		}
		if(serverResponse.getExceptionCode()!=null) {
			if(serverResponse.getExceptionCode()=="RecordNotFoundException")
				System.out.println("No such Account!");
			if(serverResponse.getExceptionCode()=="WrongPasswordException")
				System.out.println("Wrong Password!");
		}
		return false;
	}
	
}
