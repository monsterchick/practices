class Singleton:
    # 通常是类的私有成员，即只能在类内部访问的成员。
    __instance = None

    # @這是一個裝飾器 因此不需要在方法的括號裡面加’self‘; get_instance() 這是一個 static method
    @staticmethod
    def get_instance():
        # 如果實例不存在，就創建實例
        if Singleton.__instance == None:
            Singleton()
        # 返回實例
        return Singleton.__instance

    # __init__類似kotlin的constructor
    def __init__(self):
        # 禁止使用s1.Singleton
        if Singleton.__instance is not None:
            raise Exception('Single exists already!')
        else:
            Singleton.__instance = self

s1 = Singleton.get_instance()
print(s1)

s2 = Singleton.get_instance()
print(s2)

# 實現了全局共享
s1.x = 5
print(s1.x)
print(s2.x)

# 實現了全局共享
s2.person = 'Jam'
print(s1.person)
print(s2.person)

# 測試__init__的if判斷
# s3 = Singleton()