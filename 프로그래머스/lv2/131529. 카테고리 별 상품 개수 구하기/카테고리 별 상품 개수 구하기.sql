-- 코드를 입력하세요
SELECT 
SUBSTRING(product_code, 1, 2) as CATEGORY,
count(*) as PRODUCTS
from PRODUCT
GROUP BY CATEGORY
order by PRODUCT_CODE asc
;