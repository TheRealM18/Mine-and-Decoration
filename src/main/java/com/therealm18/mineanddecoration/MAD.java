package com.therealm18.mineanddecoration;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mineanddecoration")
public class MAD
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final ItemGroup STAIRS = new ItemGroup(Ref.MODID + "_stairs") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockReferance.BLOCK_GLASS_STAIRS);
        }

    };
    
    public static final ItemGroup SLABS = new ItemGroup(Ref.MODID + "_slabs") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockReferance.BLOCK_GLASS_SLABS);
        }

    };

    public MAD() {

        System.out.println("Starting Mine and Decoration");

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
        

        
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event) 
    {
    	
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
    	
    }

    private void processIMC(final InterModProcessEvent event)
    {
    	
    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {


    	@SubscribeEvent
    	public static void registerItems(RegistryEvent.Register<Item> event) 
    	{
    		
    		
    		//Stairs
    		
    		//Glass
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_WHITE_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.WHITE_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_ORANGE_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.ORANGE_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_MAGENTA_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.MAGENTA_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_BLUE_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.LIGHT_BLUE_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_YELLOW_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.YELLOW_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIME_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.LIME_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PINK_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.PINK_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GRAY_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.GRAY_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_GRAY_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.LIGHT_GRAY_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_CYAN_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.CYAN_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PURPLE_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.PURPLE_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLUE_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.BLUE_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BROWN_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.BROWN_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GREEN_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.GREEN_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_RED_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.RED_GLASS_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLACK_GLASS_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.BLACK_GLASS_STAIRS));
    		
    		//Terracotta
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_WHITE_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.WHITE_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_ORANGE_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.ORANGE_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_MAGENTA_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.MAGENTA_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_BLUE_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.LIGHT_BLUE_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_YELLOW_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.YELLOW_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIME_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.LIME_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PINK_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.PINK_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GRAY_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.GRAY_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_GRAY_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.LIGHT_GRAY_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_CYAN_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.CYAN_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PURPLE_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.PURPLE_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLUE_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.BLUE_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BROWN_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.BROWN_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GREEN_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.GREEN_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_RED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.RED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLACK_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.BLACK_TERRACOTTA_STAIRS));
    		
    		//Glazed Terracotta
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_WHITE_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.WHITE_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_ORANGE_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.ORANGE_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_MAGENTA_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.MAGENTA_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_YELLOW_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.YELLOW_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIME_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.LIME_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PINK_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.PINK_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GRAY_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.GRAY_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_CYAN_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.CYAN_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PURPLE_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.PURPLE_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLUE_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.BLUE_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BROWN_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.BROWN_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GREEN_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.GREEN_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_RED_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.RED_GLAZED_TERRACOTTA_STAIRS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLACK_GLAZED_TERRACOTTA_STAIRS, new Item.Properties().group(STAIRS)).setRegistryName(BlockReferance.BLACK_GLAZED_TERRACOTTA_STAIRS));
     		
    		
    		//Slabs
    		
    		//Glass
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_WHITE_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.WHITE_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_ORANGE_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.ORANGE_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_MAGENTA_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.MAGENTA_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_BLUE_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.LIGHT_BLUE_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_YELLOW_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.YELLOW_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIME_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.LIME_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PINK_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.PINK_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GRAY_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.GRAY_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_GRAY_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.LIGHT_GRAY_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_CYAN_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.CYAN_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PURPLE_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.PURPLE_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLUE_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.BLUE_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BROWN_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.BROWN_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GREEN_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.GREEN_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_RED_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.RED_GLASS_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLACK_GLASS_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.BLACK_GLASS_SLABS));
    		
    		//Terracotta
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_WHITE_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.WHITE_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_ORANGE_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.ORANGE_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_MAGENTA_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.MAGENTA_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_BLUE_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.LIGHT_BLUE_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_YELLOW_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.YELLOW_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIME_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.LIME_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PINK_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.PINK_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GRAY_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.GRAY_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_GRAY_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.LIGHT_GRAY_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_CYAN_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.CYAN_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PURPLE_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.PURPLE_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLUE_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.BLUE_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BROWN_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.BROWN_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GREEN_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.GREEN_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_RED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.RED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLACK_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.BLACK_TERRACOTTA_SLABS));
    		
    		//Glazed Terracotta
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_WHITE_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.WHITE_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_ORANGE_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.ORANGE_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_MAGENTA_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.MAGENTA_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_BLUE_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.LIGHT_BLUE_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_YELLOW_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.YELLOW_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIME_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.LIME_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PINK_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.PINK_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GRAY_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.GRAY_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_LIGHT_GRAY_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.LIGHT_GRAY_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_CYAN_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.CYAN_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_PURPLE_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.PURPLE_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLUE_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.BLUE_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BROWN_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.BROWN_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_GREEN_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.GREEN_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_RED_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.RED_GLAZED_TERRACOTTA_SLABS));
    		event.getRegistry().register(new BlockItem(BlockReferance.BLOCK_BLACK_GLAZED_TERRACOTTA_SLABS, new Item.Properties().group(SLABS)).setRegistryName(BlockReferance.BLACK_GLAZED_TERRACOTTA_SLABS));

    	}
    	
        @SubscribeEvent
    	public static void register(RegistryEvent.Register<Effect> event) 
        {
        	

    	}
    	
        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) 
        {
        	
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


        	//Slabs
        	
        	//Glass
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("white_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("orange_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("magenta_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("light_blue_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("yellow_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("lime_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("pink_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("gray_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("light_gray_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("cyan_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("purple_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("blue_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("brown_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("green_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("red_glass_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS).hardnessAndResistance(5F)).setRegistryName("black_glass_slabs"));
        	
        	//Terracotta
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("white_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("orange_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("magenta_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("light_blue_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("yellow_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("lime_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("pink_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("gray_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("light_gray_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("cyan_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("purple_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("blue_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("brown_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("green_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("red_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("black_terracotta_slabs"));
        	
        	//Glazed Terracotta
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("white_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("orange_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("magenta_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("light_blue_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("yellow_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("lime_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("pink_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("gray_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("light_gray_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("cyan_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("purple_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("blue_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("brown_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("green_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("red_glazed_terracotta_slabs"));
        	event.getRegistry().register(new Slabs(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(5F)).setRegistryName("black_glazed_terracotta_slabs"));
        	
        }
        
        @SubscribeEvent
        public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> event) 
        {
        	
        }
        
        @SubscribeEvent
        public static void registerContainers(final RegistryEvent.Register<ContainerType<?>> event) {

        }
        
        @SubscribeEvent
        public static void registerEnchantments(final RegistryEvent.Register<Enchantment> event)
        {
        	
        }
    }
}

