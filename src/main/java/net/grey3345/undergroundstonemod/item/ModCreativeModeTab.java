package net.grey3345.undergroundstonemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab UNDERGROUNDSTONE_TAB = new CreativeModeTab("undergroundstonetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
    // Duplicate CreativeModTab method to create a new tab.
}
