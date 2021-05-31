package kodlamaio.hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult {


	
	public ErrorDataResult(T data, String message) {
		super(data, true,message);
		// TODO Auto-generated constructor stub
	}
	
	public ErrorDataResult(T data) {
		super(data, true);
		// TODO Auto-generated constructor stub
	}
	public ErrorDataResult(String message) {
		super(null, true,message);
		// TODO Auto-generated constructor stub
	}
	public ErrorDataResult() {
		super(null,true);
	}


}
