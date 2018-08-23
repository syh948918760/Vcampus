package vCampus.client.biz;

import vCampus.client.socket.Client;
import vCampus.client.socket.ClientRequest;

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
	
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
		serviceName = "StudentService";
	}
	

	@Override
	public boolean login(int studentID, String studentPassword) {
		// TODO Auto-generated method stub
		Object object = client.sendRequestToServer(new ClientRequest
				(serviceName,"login",new Class[] {int.class,String.class},
						new Object[] {studentID,studentPassword}));
		if(object!= null)
		{
			return true;
		}
		return false;
	}
	
}
