public class MilkTea {
    protected String MilkTeaName;
    protected Ingredient ingredient;
    protected MilkTea(String Name) {
        MilkTeaName = Name;
    }

    @Override
    public String toString() {
        return "奶茶名字："+MilkTeaName+" 配料名字"+ingredient.IngredientName;
    }
}
