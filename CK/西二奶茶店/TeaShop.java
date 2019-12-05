import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class TeaShop implements Shop {
    ArrayList<Bubble> B = new ArrayList<Bubble>();
    ArrayList<Coconut> C = new ArrayList<Coconut>();
    @Override
    public void Purchase(Ingredient ingredient) {
        if(ingredient instanceof Bubble)
        {
            Bubble b1=(Bubble)ingredient;
            B.add(b1);
        }
        else
        {
            Coconut c1=(Coconut)ingredient;
            C.add(c1);
        }
    }
    @Override
    public void SellMilkTea(String MilkTeaName,String IngredientName) {
        MilkTea m1=new MilkTea(MilkTeaName);
        if(IngredientName.equals("Bubble"))
        {
                Calendar Date = Calendar.getInstance();
                int Year,Month,Day;
                System.out.println("请输入当前日期：");
                Scanner in=new Scanner(System.in);
                Year = in.nextInt();
                Month = in.nextInt();
                Day = in.nextInt();
                Date.set(Year,Month-1,Day);
                boolean flag=true;      //标记Bubble是否过期；
                while(flag&&!B.isEmpty())
                {
                    long time = (Date.getTimeInMillis() - B.get(B.size()-1).ProductionDate.getTimeInMillis())/(1000*60*60*24);
                    if(time > B.get(B.size()-1).QualityGuaranteePeriod)
                    {
                        B.remove(B.size()-1);
                    }
                    else    flag = false;
                }
                boolean isEmpty;
                if(B.isEmpty())     isEmpty = true;
                else
                {
                    isEmpty = false;
                    B.remove(B.size()-1);
                }
                try{
                    TextException text = new TextException();
                    text.check(IngredientName , isEmpty);
                } catch (SoldOutException e) {
                    e.printStackTrace();
                }
        }
        else if(IngredientName.equals("Coconut"))
        {
                Calendar Date = Calendar.getInstance();
                int Year,Month,Day;
                System.out.println("请输入当前日期：");
                Scanner in=new Scanner(System.in);
                Year = in.nextInt();
                Month = in.nextInt();
                Day = in.nextInt();
                Date.set(Year,Month-1,Day);
                boolean flag=true;
                while(flag&&!C.isEmpty())
                {
                    long time = (Date.getTimeInMillis() - C.get(C.size()-1).ProductionDate.getTimeInMillis())/(1000*60*60*24);
                    System.out.println(time);
                    if(time > C.get(C.size()-1).QualityGuaranteePeriod)
                    {
                        C.remove(C.size()-1);
                    }
                    else    flag = false;
                }
                boolean isEmpty;
                if(C.isEmpty())     isEmpty = true;
                else
                {
                    isEmpty = false;
                    C.remove(C.size()-1);
                }
                try{
                    TextException text = new TextException();
                    text.check(IngredientName , isEmpty);
                }
                catch (SoldOutException e) {
                    e.printStackTrace();
                }
        }
    }
}

interface Shop{
    public abstract void Purchase(Ingredient ingredient);
    public abstract void SellMilkTea(String MilkTeaName,String IngredientName);
}
