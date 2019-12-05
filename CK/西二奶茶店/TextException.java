public class TextException {
    public void check (String ingredient , boolean flag) throws SoldOutException
    {
        if(ingredient.equals("Bubble") && flag)
        {
            throw new SoldOutException("Sorry,Bubble has been sold out!");
        }
        else if(ingredient.equals("Coconut") && flag)
        {
            throw new SoldOutException("Sorry,Coconut has been sold out!");
        }
    }
}
