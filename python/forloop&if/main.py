data = {
    'table': [
        ['name', 'age', 'addr', 'number', 'email'],
        ['Kitty', 25, '...,uk', '114134', 'kitty@gmail.com'],
        ['Tom', 12, '...,us', '234657', 'tom_123@yahoo.com'],
        ['Jeck', 33, '...,jp', '67834', 'jeck@123.com']
    ]
}

# 打印成表格
# print(len(data['table']))
# print(data['table'])
for i in range(len(data['table'])):
    # 当前表格的index
    # print('正在处理的列表',i)

    # 每个列表
    # print(data['table'][i])

    for d in data['table'][i]:
        print(d,end=" ")
    print()