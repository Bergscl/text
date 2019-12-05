public class SoldOutException extends Exception{
    protected String message;
    public SoldOutException(String message)
    {
        super(message);
        this.message = message;
    }
}