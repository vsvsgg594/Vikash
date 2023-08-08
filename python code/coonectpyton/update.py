import mysql.connector
conn=mysql.connector.connect(host='localhost',username='root',password='root',database='books')
my_cursor=conn.cursor()
try:
    my_cursor.execute("update book set book_name='aaaaa' where book_id =4")
    conn.commit()
except:
    conn.rollback()
conn.close()        