
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
public class GoldenBattleAxeItem extends VanillaAdditionsModElements.ModElement {
	@ObjectHolder("vanilla_additions:golden_battle_axe")
	public static final Item block = null;
	public GoldenBattleAxeItem(VanillaAdditionsModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.GOLD_INGOT, (int) (1)));
			}
		}, 1, -3.6f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("golden_battle_axe"));
	}
}
