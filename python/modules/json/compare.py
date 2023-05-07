import json

py_obj = {
    'key1': 'val1',
    'key2': {'subkey2': 'sub val2'},
    'key3': ['val4', 'val5,val6']
}
js = json.dumps(py_obj)
print(js)
