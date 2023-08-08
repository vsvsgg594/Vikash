# import mysql.connector
# conn=mysql.connector.connect(host='localhost',username='root',password='root',database='book')
# my_cursor=conn.cursor()
# conn.commit()
# conn.close()
# print("connection successfully")
import mysql.connector
conn=mysql.connector.connect(host='localhost',username='root',password='root',database='book')
my_cursor=conn.cursor()
conn.commit()
conn.close()
print("connect succsessfully")