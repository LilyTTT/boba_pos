--display list of inventory items whose current inventory is less than the inventory item's min amount to have before needing to restock
-- min amount can be 100 for now 
SELECT name FROM ingredients WHERE stock_level <= 100;