package ExceptionHandling.CustomException;

public class StudentIDNotFoundException extends Exception {

	int sid;

	StudentIDNotFoundException()
	{		
	}

	public StudentIDNotFoundException(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
      return "Exception :: Student id not found!!";
	}

	@Override
	public String getMessage() {
		return "Student with id "+ sid + " Not found!!";
	}
}
