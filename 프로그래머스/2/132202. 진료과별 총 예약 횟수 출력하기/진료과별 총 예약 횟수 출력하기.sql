select MCDP_CD as "진료과코드", count(MCDP_CD) as "5월예약건수"
from appointment
where to_char(APNT_YMD, 'YYYY-MM') = '2022-05'
group by MCDP_CD
order by count(MCDP_CD), MCDP_CD