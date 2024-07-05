SELECT A.flavor
from first_half A inner join icecream_info B on A.flavor = B.flavor
where total_order > 3000 and ingredient_type = 'fruit_based';