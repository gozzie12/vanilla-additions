
package vanilla_additions.item;

import vanilla_additions.VanillaAdditionsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@VanillaAdditionsModElements.ModElement.Tag
public class IronBattleAxeItem extends VanillaAdditionsModElements.ModElement {
	@ObjectHolder("vanilla_additions:iron_battle_axe")
	public static final Item block = null;
	public IronBattleAxeItem(VanillaAdditionsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 13;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT, (int) (1)));
			}
		}, 1, -3.6f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("iron_battle_axe"));
	}
}
