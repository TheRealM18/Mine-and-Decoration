package com.therealm18.mineanddecoration;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.therealm18.mineanddecoration.database.blocks.Slabs;
import com.therealm18.mineanddecoration.database.blocks.Stairs;
import com.therealm18.mineanddecoration.registry.BlockReferance;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mineanddecoration")
public class MAD
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final ItemGroup DECORATION = new ItemGroup(Ref.MODID + "_deco") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockReferance.BLOCK_GLASS_STAIRS);
        }

    };
    public MAD() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
    	

    	@SubscribeEvent
    	public static void registerItems(RegistryEvent.Register<Item> event) {
    		
    		//Stairs
    		
    		//Glass
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_wHITE_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.wHITE_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_ORANGE_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.ORANGE_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_MAGENTA_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.MAGENTA_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_BLUE_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.LIGHT_BLUE_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_YELLOW_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.YELLOW_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIME_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.LIME_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PINK_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.PINK_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GRAY_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.GRAY_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_GRAY_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.LIGHT_GRAY_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_CYAN_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.CYAN_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PURPLE_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.PURPLE_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLUE_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.BLUE_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BROWN_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.BROWN_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GREEN_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.GREEN_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_RED_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.RED_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLACK_GLASS_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.BLACK_GLASS_STAIRS));
    		
    		//Terracotta
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_wHITE_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.wHITE_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_ORANGE_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.ORANGE_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_MAGENTA_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.MAGENTA_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_BLUE_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.LIGHT_BLUE_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_YELLOW_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.YELLOW_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIME_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.LIME_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PINK_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.PINK_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GRAY_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.GRAY_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_GRAY_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.LIGHT_GRAY_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_CYAN_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.CYAN_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PURPLE_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.PURPLE_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLUE_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.BLUE_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BROWN_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.BROWN_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GREEN_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.GREEN_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_RED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.RED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLACK_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.BLACK_TERRACOTTA_STAIRS));
    		
    		//Glazed Terracotta
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_wHITE_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.wHITE_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_ORANGE_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.ORANGE_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_MAGENTA_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.MAGENTA_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_YELLOW_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.YELLOW_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIME_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.LIME_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PINK_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.PINK_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GRAY_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.GRAY_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_CYAN_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.CYAN_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PURPLE_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.PURPLE_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLUE_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.BLUE_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BROWN_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.BROWN_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GREEN_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.GREEN_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_RED_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.RED_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLACK_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.BLACK_GLAZED_TERRACOTTA_STAIRS));
    		
//    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GLASS_SLAB, new Item.Properties().group(DECORATION)).setRegistryName(BlockReferance.GLASS_SLAB));

    	}
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
        	
        	//Stairs
        	
        	//Glass
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("white_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("orange_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("magenta_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("light_blue_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("yellow_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("lime_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("pink_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("gray_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("light_gray_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("cyan_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("purple_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("blue_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("brown_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("green_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("red_glass_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("black_glass_stairs"));
        	
        	//Terracotta
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("white_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("orange_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("magenta_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("light_blue_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("yellow_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("lime_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("pink_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("gray_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("light_gray_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("cyan_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("purple_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("blue_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("brown_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("green_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("red_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("black_terracotta_stairs"));
        	
        	//Glazed Terracotta
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("white_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("orange_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("magenta_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("light_blue_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("yellow_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("lime_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("pink_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("gray_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("light_gray_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("cyan_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("purple_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("blue_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("brown_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("green_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("red_glazed_terracotta_stairs"));
        	event.getRegistry().register(new Stairs(Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)).setRegistryName("black_glazed_terracotta_stairs"));
//        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)).setRegistryName("glass_slab"));
        }
    }
}
