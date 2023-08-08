import mysql.connector
conn=mysql.connector.connect(host='localhost',username='root',password='root',database='books')
my_cursor=conn.cursor()
sql="insert into book(book_id,book_name) values(%s,%s)"
val=[(3,"sanskriti"),(4,"mohanjodaro")]
my_cursor.executemany(sql,val)
conn.commit()
print(my_cursor.rowcount,"inserted data successfully")
conn.close()