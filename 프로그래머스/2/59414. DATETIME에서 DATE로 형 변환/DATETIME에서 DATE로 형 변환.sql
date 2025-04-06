select animal_id, name, to_char(datetime, 'YYYY-MM-DD') as 날짜
from animal_ins
order by animal_id