package dontneg.improvedfletching.item;

import dontneg.improvedfletching.ImprovedFletching;
import dontneg.improvedfletching.arrows.blaze.BlazeArrow;
import dontneg.improvedfletching.arrows.carrot.CarrotArrow;
import dontneg.improvedfletching.arrows.honey.HoneyArrow;
import dontneg.improvedfletching.arrows.quartz.QuartzArrow;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ArrowItems {
    public static final Item ARROW_BLAZE = registerItem("arrow_blaze",
            new BlazeArrow(new Item.Settings()));
    public static final Item ARROW_CARROT = registerItem("arrow_carrot",
            new CarrotArrow(new Item.Settings()));
    public static final Item ARROW_HONEY = registerItem("arrow_honey",
            new HoneyArrow(new Item.Settings()));
    public static final Item ARROW_QUARTZ = registerItem("arrow_quartz",
            new QuartzArrow(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ImprovedFletching.MODID, name), item);
    }

    public static void registerItems() {}
}
