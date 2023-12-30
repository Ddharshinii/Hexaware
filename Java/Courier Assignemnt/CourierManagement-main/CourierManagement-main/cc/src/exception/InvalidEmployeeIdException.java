package exception;

@SuppressWarnings("serial")
public  class InvalidEmployeeIdException extends Exception {
    public  InvalidEmployeeIdException(int id) {
        super("No Employee Found with Id : "+id);
    }
}