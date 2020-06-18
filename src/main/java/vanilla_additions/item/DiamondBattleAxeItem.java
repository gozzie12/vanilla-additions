
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
public class DiamondBattleAxeItem extends VanillaAdditionsModElements.ModElement {
	@ObjectHolder("vanilla_additions:diamond_battle_axe")
	public static final Item block = null;
	public DiamondBattleAxeItem(VanillaAdditionsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1561;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.DIAMOND, (int) (1)));
			}
		}, 1, -3.6f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("diamond_battle_axe"));
	}
}
