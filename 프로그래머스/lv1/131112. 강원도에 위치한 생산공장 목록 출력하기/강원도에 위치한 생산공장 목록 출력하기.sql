-- 코드를 입력하세요
SeLECT FACTORY_ID,FACTORY_NAME,address
from food_factory
where address like '%강원도%'
order by factory_id asc;