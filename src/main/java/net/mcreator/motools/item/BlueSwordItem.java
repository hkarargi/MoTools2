
package net.mcreator.motools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.motools.itemgroup.HussmekTabItemGroup;
import net.mcreator.motools.MoToolsModElements;

@MoToolsModElements.ModElement.Tag
public class BlueSwordItem extends MoToolsModElements.ModElement {
	@ObjectHolder("mo_tools:blue_sword")
	public static final Item block = null;
	public BlueSwordItem(MoToolsModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 9000;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 13f;
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
		}, 3, -1f, new Item.Properties().group(HussmekTabItemGroup.tab)) {
		}.setRegistryName("blue_sword"));
	}
}
