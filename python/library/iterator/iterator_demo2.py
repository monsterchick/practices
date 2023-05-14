list  = [1,2,3,4,5,6,7,8,9,10]

iterator = iter(list)
print(f'normal list: {type(list)}')
print(f'using __iter__: {type(iterator)}')

print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))

# 超出部分提示錯誤
print(next(iterator))