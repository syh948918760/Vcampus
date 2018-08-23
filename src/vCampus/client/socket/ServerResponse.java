package vCampus.client.socket;

import java.io.Serializable;

/**
 * @author SongZixing
 * 
 * @version 0.0
 *
 */
public class ServerResponse implements Serializable {

	private Object dataFromServer;
	
	public ServerResponse() {
		super();
	}
	
	public ServerResponse(Object dataFromServer) {
		this.dataFromServer = dataFromServer;
	}
	
	public Object getDataFromServer() {
		return dataFromServer;
	}
	
	public void setDataFromServer(Object dataFromServer) {
		this.dataFromServer = dataFromServer;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	 return "ServerResponse{" +
        "data=" + dataFromServer +
        '}';
	}
}
