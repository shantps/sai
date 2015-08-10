package raisingteam.controller;

public class Response {

	private String status;
	
	private String loggedInUser;
	
	public String getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(String loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	public Response() {
	        //constructor Code
	    }

	public Response(String status) {
		// TODO Auto-generated constructor stub
		this.status=status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
