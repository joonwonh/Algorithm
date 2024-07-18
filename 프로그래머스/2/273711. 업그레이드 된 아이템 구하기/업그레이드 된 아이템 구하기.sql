select b.item_id, a.item_name, a.rarity
from Item_info as a inner join item_tree as b on a.item_id = b.item_id
WHERE b.PARENT_ITEM_ID IN (SELECT ITEM_ID
                              FROM ITEM_INFO
                              WHERE RARITY='RARE')
ORDER BY
    b.ITEM_ID DESC