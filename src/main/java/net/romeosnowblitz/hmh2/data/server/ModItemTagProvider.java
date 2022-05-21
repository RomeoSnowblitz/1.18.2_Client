package net.romeosnowblitz.hmh2.data.server;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.BlockTagProvider;
import net.minecraft.data.server.ItemTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagKey;
import net.romeosnowblitz.hmh2.tag.ModItemTags;

/*

    This was made for a Custom Fuel Type,
    I ended up finding an easier solution,
    But I still wanted to keep this file :)

 */

public class ModItemTagProvider extends ItemTagProvider {
    public ModItemTagProvider(DataGenerator root, BlockTagProvider blockTagsProvider) {
        super(root, blockTagsProvider);
    }

    protected void configure() {
        this.getOrCreateTagBuilder(ModItemTags.COOLANTS).add((Item[])new Item[]{Items.SNOW_BLOCK, Items.SNOWBALL});
    }

    protected void copy(TagKey<Block> blockTag, TagKey<Item> itemTag) {
        Tag.Builder builder = this.getTagBuilder(itemTag);
        builder.streamEntries().forEach(builder::add);
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
