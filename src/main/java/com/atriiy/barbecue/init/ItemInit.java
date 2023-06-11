package com.atriiy.barbecue.init;

import com.atriiy.barbecue.Barbecue;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Barbecue.MOD_ID);

    // Meat
    public static final RegistryObject<Item> PORK_SKEWER = ITEMS.register("pork_skewer", () -> new Item(creativeTab()
            .food(new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).alwaysEat().meat().build())));

    private static Item.Properties creativeTab() {
        return new Item.Properties().tab(Barbecue.MOD_CREATIVE_TAB);
    }
}
