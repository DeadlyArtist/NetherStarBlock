package netherstarblock.item;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import netherstarblock.ModEntry;
import netherstarblock.utils.Lazy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {
    public static Map<Identifier, BlockData> data = new HashMap<>();

    public static final BlockData NETHER_STAR_BLOCK = register(BlockData.create("NETHER_STAR_BLOCK", () -> new Block(Block.Settings.create().sounds(BlockSoundGroup.METAL).strength(5.0F, 10.0F).requiresTool().luminance(state -> 5))).addGroup(ItemGroups.TOOLS).addTag(BlockTags.PICKAXE_MINEABLE).addTag(BlockTags.NEEDS_DIAMOND_TOOL).addTag(BlockTags.WITHER_IMMUNE).addTag(BlockTags.DRAGON_IMMUNE).setItemSettings(new Item.Settings().rarity(Rarity.RARE).component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));


    public static BlockData register(BlockData.Builder builder) {
        var block = builder.build();
        data.put(block.id, block);
        ModItems.register(ItemData.fromBlock(block));
        return block;
    }

    public static void init() {

    }
}
