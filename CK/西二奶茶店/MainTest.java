import javafx.scene.effect.InnerShadow;

import java.util.Scanner;

public class MainTest {
    public static void main(String args[])
    {
        TeaShop GuMing = new TeaShop();
        Scanner in = new Scanner(System.in);
        int flag = 1;
        while(flag == 1)
        {
            System.out.println("是否进货？");
            flag = in.nextInt();
            if(flag == 1)
            {
                Bubble b1 = new Bubble();
                GuMing.Purchase(b1);
                Coconut c1 = new Coconut();
                GuMing.Purchase(c1);
            }
        }
        String MilkTeaName,IngredientName;
        while(flag == 1)
        {
            System.out.println("是否售出奶茶？");
            flag = in.nextInt();
            if(flag == 1)
            {
                System.out.println("请输入奶茶名字：");
                MilkTeaName = in.next();
                System.out.println("请输入要添加的配料：");
                IngredientName = in.next();
                GuMing.SellMilkTea(MilkTeaName , IngredientName);
            }
        }
    }
}
