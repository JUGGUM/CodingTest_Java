-- 코드를 입력하세요
SELECT  PRODUCT_CODE, SUM(SALES_AMOUNT)*PRICE as SALES
from PRODUCT pd
LEFT JOIN OFFLINE_SALE os ON os.PRODUCT_ID = pd.PRODUCT_ID
GROUP BY PRODUCT_CODE
ORDER BY SALES desc, PRODUCT_CODE
;