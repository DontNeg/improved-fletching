package dontneg.improvedfletching.creativetab;

import dontneg.improvedfletching.ImprovedFletching;
import dontneg.improvedfletching.item.ArrowItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ImprovedFletchingTab {

    @SuppressWarnings("unused")
    public static final ItemGroup FLETCHING_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ImprovedFletching.MODID, "improved_fletching"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.improvedfletching"))
                    .icon(() -> new ItemStack(ArrowItems.ARROW_CARROT)).entries((displayContext, entries) -> {
                        entries.add(ArrowItems.ARROW_BLAZE);
                        entries.add(ArrowItems.ARROW_CARROT);
                        entries.add(ArrowItems.ARROW_HONEY);
                        entries.add(ArrowItems.ARROW_QUARTZ);
                    }).build()
    );

    public static void registerCreativeTabs() {}
}
