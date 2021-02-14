package net.mcreator.motools.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.motools.MoToolsModElements;

import java.util.Map;

@MoToolsModElements.ModElement.Tag
public class BluePotionOnPotionActiveTickProcedure extends MoToolsModElements.ModElement {
	public BluePotionOnPotionActiveTickProcedure(MoToolsModElements instance) {
		super(instance, 56);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BluePotionOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 40);
	}
}
