
package net.mcreator.motools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.motools.itemgroup.HussmekTabItemGroup;
import net.mcreator.motools.MoToolsModElements;

@MoToolsModElements.ModElement.Tag
public class HussmekAxeItem extends MoToolsModElements.ModElement {
	@ObjectHolder("mo_tools:hussmek_axe")
	public static final Item block = null;
	public HussmekAxeItem(MoToolsModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 18000;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 58f;
			}

			public int getHarvestLevel() {
				return 16;
			}

			public int getEnchantability() {
				return 60;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HussmekIngotItem.block, (int) (1)));
			}
		}, 1, 0f, new Item.Properties().group(HussmekTabItemGroup.tab)) {
		}.setRegistryName("hussmek_axe"));
	}
}
