import java.util.Calendar;

public abstract class Ingredient {
    protected String IngredientName;
    protected int QualityGuaranteePeriod;
    protected Calendar ProductionDate = Calendar.getInstance();
    public String toString()
    {
        return "配料名称："+IngredientName+" 生产日期："+ProductionDate.get(Calendar.YEAR)+'年'+ProductionDate.get(Calendar.MONTH)+'月'+ProductionDate.get(Calendar.DATE)+'日'+" 保质期："+QualityGuaranteePeriod+'天';
    }
}
