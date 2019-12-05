import java.util.Calendar;
import java.util.Scanner;

public class Bubble extends Ingredient {
    protected Bubble()
    {
        this.IngredientName="Bubble";
        this.QualityGuaranteePeriod=7;
        int Year,Month,Date;
        System.out.println("请输入Bubble生产日期：");
        Scanner in=new Scanner(System.in);
        Year=in.nextInt();
        Month=in.nextInt();
        Date=in.nextInt();
        ProductionDate.set(Year,Month-1,Date);
    }
    public String toString()
    {
        return "配料名称："+IngredientName+" 生产日期："+ProductionDate.get(Calendar.YEAR)+'年'+ProductionDate.get(Calendar.MONTH)+'月'+ProductionDate.get(Calendar.DATE)+'日'+" 保质期："+QualityGuaranteePeriod+'天';
    }
}
