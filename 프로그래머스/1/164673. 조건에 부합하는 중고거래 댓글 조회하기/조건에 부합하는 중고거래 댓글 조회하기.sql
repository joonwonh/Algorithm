SELECT A.title, B.board_id, B.reply_id, B.writer_id, B.contents, date_format(B.created_date, '%Y-%m-%d') as created_DATE
from used_goods_reply B inner join used_goods_board A on A.board_id = B.board_id
where A.created_date LIKE '2022-10%'
order by created_date, A.title;