import json

py_obj = {
    'key1': 'val1',
    'key2': {'subkey2': 'sub val2'},
    'key3': ['val4', 'val5', 'val6']
}

j_str = '{"key1": "val1", "key2": {"subkey2": "sub val2"}, "key3": ["val4", "val5,val6"]}'

def dumps():
    # 将Python对象转换为JSON格式字符串 | 可以通过JSON Validator的测试
    json_str = json.dumps(py_obj)
    method = 'json.dumps()'
    return method, json_str


def loads(json_str):
    py_obj = json.loads(json_str)
    method = 'json.loads()'
    return method, py_obj


def print_result(method, data):
    print(f'{method} type: {type(data)} {data}')


def dump(py_obj):
    method = 'json.dump()'
    # Python对象转换为JSON格式字符串，并写进JSON文件
    with open('test.json', 'w') as f:
        json.dump(py_obj, f)

    # 读取JSON文件的数据
    with open('test.json', 'r') as f:
        json_str = f.read()
        print_result(method, json_str)


def load():
    method = 'json.load()'
    with open('test.json', 'r') as f:
        py_obj = json.load(f)
        print_result(method, py_obj)


# 打印转换后的JSON字符串
print_result(dumps()[0], dumps()[1])

# 打印转换后的Python对象
print_result(loads(j_str)[0], loads(j_str)[1])

# 把Python对象写入JSON文件 | 用f.read()读取数据
dump(py_obj)

# 读取JSON文件的的数据 | 等同于f.read()
load()
