list  = [1,2,3,4,5,6,7,8,9,10]

iterator = list.__iter__()
print(f'normal list: {type(list)}')
print(f'using __iter__: {type(iterator)}')


print(iterator.__next__())
print(iterator.__next__())
print(iterator.__next__())
print(iterator.__next__())
print(iterator.__next__())
print(iterator.__next__())
print(iterator.__next__())
print(iterator.__next__())
print(iterator.__next__())
print(iterator.__next__())

# 超出部分提示錯誤
print(iterator.__next__())