import Classes.ItemGenerator;
import Classes.Rewards.Bronze.BronzeFabric;
import Classes.Rewards.Gem.GemFabric;
import Classes.Rewards.Gold.GoldFabric;
import Classes.Rewards.Platinum.PlatinumFabric;
import Classes.Rewards.Ruby.RubyFabric;
import Classes.Rewards.Sapphire.SapphireFabric;
import Classes.Rewards.Silver.SilverFabric;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        GoldFabric fab1 = new GoldFabric();
        fab1.openReward();
        GemFabric fab2 = new GemFabric();
        fab2.openReward();
        SilverFabric fab3 = new SilverFabric();
        fab3.openReward();
        BronzeFabric fab4 = new BronzeFabric();
        fab4.openReward();
        PlatinumFabric fab5 = new PlatinumFabric();
        fab5.openReward();
        RubyFabric fab6 = new RubyFabric();
        fab6.openReward();
        SapphireFabric fab7 = new SapphireFabric();
        fab7.openReward();
        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab1);
        fabricList.add(fab2);
        fabricList.add(fab3);
        fabricList.add(fab4);
        fabricList.add(fab5);
        fabricList.add(fab6);
        fabricList.add(fab7);

        for(int i=0;i<20;i++)
        {
            int index = (int) (Math.random() * fabricList.size());
            fabricList.get(index).openReward();
        }
    }
}