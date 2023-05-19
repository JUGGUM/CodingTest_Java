-- 코드를 입력하세요
SELECT ais.ANIMAL_ID, ais.NAME from ANIMAL_INS as ais
left join ANIMAL_OUTS as ao on ais.ANIMAL_ID = ao.ANIMAL_ID
where ao.datetime is not null
order by (ao.datetime - ais.datetime) desc

limit 2
;