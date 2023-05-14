'''
目的是推迟对象的创建或计算，直到第一次访问该对象时。
这个模式可以提高程序的性能，因为它避免了在不需要的情况下创建不必要的对象或执行不必要的计算。
Lazy Initialization Pattern 的实现通常涉及到延迟加载和缓存技术。
'''

import psycopg2

class Database:
    def __init__(self):
        self._connection = None

    @property
    def connection(self):
        if not self._connection:
            self._connection = psycopg2.connect(
                database="mydatabase",
                user="myuser",
                password="mypassword",
                host="localhost",
                port="5432"
            )
        return self._connection

db = Database()

# 程序执行到这里时，尚未创建数据库连接

# 当需要进行数据库操作时，调用 db.connection 获取连接对象
with db.connection.cursor() as cursor:
    cursor.execute("SELECT * FROM mytable")
    result = cursor.fetchall()
'''在数据库操作完成后，连接会自动关闭，释放资源'''


