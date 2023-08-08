import mysql.connector
conn=mysql.connector.connect(host='localhost',username='root',password='root',database='books')
my_cursor=conn.cursor()
sql="insert into book (book_id,book_name) values(%s,%s)"
val=(1,"and")
my_cursor.execute(sql,val)
conn.commit()
print(my_cursor.rowcount)
conn.close()