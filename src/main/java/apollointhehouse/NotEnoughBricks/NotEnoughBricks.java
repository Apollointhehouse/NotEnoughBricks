package apollointhehouse.NotEnoughBricks;

import net.fabricmc.api.ModInitializer;
import net.minecraft.src.Block;
import net.minecraft.src.Material;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockHelper;


public class NotEnoughBricks implements ModInitializer {
    public static final String MOD_ID = "notenoughbricks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    // Blocks
    public static final Block flintBricks = BlockHelper.createBlock(MOD_ID, new Block(900, Material.ground), "flintBricks", "flint_bricks.png", Block.soundStoneFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block ironBricks = BlockHelper.createBlock(MOD_ID, new Block(901, Material.ground), "ironBricks", "iron_bricks.png", Block.soundMetalFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block olivineBricks = BlockHelper.createBlock(MOD_ID, new Block(902, Material.ground), "olivineBricks", "olivine_bricks.png", Block.soundGlassFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block diamondBricks = BlockHelper.createBlock(MOD_ID, new Block(903, Material.ground), "diamondBricks", "diamond_bricks.png", Block.soundMetalFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block steelBricks = BlockHelper.createBlock(MOD_ID, new Block(904, Material.ground), "steelBricks", "steel_bricks.png", Block.soundMetalFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block obsidianBricks = BlockHelper.createBlock(MOD_ID, new Block(905, Material.ground), "obsidianBricks", "obsidian_bricks.png", Block.soundMetalFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block quartzBricks = BlockHelper.createBlock(MOD_ID, new Block(906, Material.ground), "quartzBricks", "quartz_bricks.png", Block.soundMetalFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block pumpkinBricks = BlockHelper.createBlock(MOD_ID, new Block(907, Material.ground), "pumpkinBricks", "pumpkin_bricks.png", Block.soundWoodFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block soulSandBricks = BlockHelper.createBlock(MOD_ID, new Block(908, Material.ground), "soulSandBricks", "soul_sand_bricks.png", Block.soundSandFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block netherrackBricks = BlockHelper.createBlock(MOD_ID, new Block(909, Material.ground), "netherrackBricks", "netherrack_bricks.png", Block.soundStoneFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block netherCoalBricks = BlockHelper.createBlock(MOD_ID, new Block(910, Material.ground), "netherCoalBricks", "nether_coal_bricks.png", Block.soundStoneFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block stoneZigzagBricks = BlockHelper.createBlock(MOD_ID, new Block(911, Material.ground), "stoneZigzagBricks", "stone_zigzag_bricks.png", Block.soundStoneFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block funkyLimestoneBricks = BlockHelper.createBlock(MOD_ID, new Block(912, Material.ground), "funkyLimestoneBricks", "funky_limestone_bricks.png", Block.soundStoneFootstep, 0.1f, 0.1f, 0.0f);
    public static final Block clayPavers = BlockHelper.createBlock(MOD_ID, new Block(913, Material.ground), "clayPavers", "clay_pavers.png", Block.soundStoneFootstep, 0.1f, 0.1f, 0.0f);


    @Override
    public void onInitialize() {
        LOGGER.info("NotEnoughBricks initialized.");
    }
}
