
package net.mcreator.motools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.motools.itemgroup.HussmekTabItemGroup;
import net.mcreator.motools.MoToolsModElements;

@MoToolsModElements.ModElement.Tag
public class BluePickaxeItem extends MoToolsModElements.ModElement {
	@ObjectHolder("mo_tools:blue_pickaxe")
	public static final Item block = null;
	public BluePickaxeItem(MoToolsModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 9000;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BlueItem.block, (int) (1)));
			}
		}, 1, -2f, new Item.Properties().group(HussmekTabItemGroup.tab)) {
		}.setRegistryName("blue_pickaxe"));
	}
}
