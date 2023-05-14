class MyList:
    def __init__(self):
        self.items = []

    def add_item(self, item):
        self.items.append(item)

    def __iter__(self):
        # 添加到列表的items傳進MyIterator的class中
        return MyIterator(self.items)


class MyIterator:
    def __init__(self, items):
        self.index = 0
        self.items = items

    def __next__(self):
        if self.index < len(self.items):
            result = self.items[self.index]
            self.index += 1
            return result
        else:
            raise StopIteration


# 创建一个 MyList 对象
my_list = MyList()

# 向 my_list 中添加元素
my_list.add_item('Apple')
my_list.add_item('Banana')
my_list.add_item('Cherry')
my_list.add_item('Durian')
my_list.add_item('Dog')
# 遍历 my_list 中的元素
for item in my_list:
    print(item)
