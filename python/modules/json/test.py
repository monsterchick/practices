import json

py_obj = {
    'key1': 'val1',
    'key2': {'subkey2': 'sub val2'},
    'key3': ['val4', 'val5,val6']
}

# 将Python对象转换为JSON格式字符串
json_str = json.dumps(py_obj)

# 打印转换后的JSON字符串
print(json_str)
