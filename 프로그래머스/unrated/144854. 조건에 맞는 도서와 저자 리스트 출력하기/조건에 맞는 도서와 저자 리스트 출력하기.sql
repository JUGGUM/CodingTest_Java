-- 코드를 입력하세요
SELECT 

 book_id, author_name, DATE_FORMAT(published_date, "%Y-%m-%d") 
FROM 
BOOK
LEFT join Author on book.author_id = author.author_id
where category = "경제"
order by published_date asc;