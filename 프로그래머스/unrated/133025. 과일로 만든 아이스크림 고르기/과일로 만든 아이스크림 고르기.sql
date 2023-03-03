-- 코드를 입력하세요
SELECT FIRST_HALF.FLAVOR from FIRST_HALF
left join Icecream_info on FIRST_HALF.FLAVOR  = Icecream_info.FLAVOR
where total_order > 3000
and INGREDIENT_TYPE = 'fruit_based'
order by total_order desc
;