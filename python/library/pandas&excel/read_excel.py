import pandas as pd
import numpy as np
from openpyxl.reader.excel import load_workbook

df = ''
# 讀取excel整個表格
def read_table():
    df = pd.read_excel('sample.xlsx',sheet_name='my_sheet')
    return df

print()
def read_col():
    df1 = pd.read_excel('sample.xlsx',sheet_name='my_sheet',usecols=['name'])
    df2 = pd.read_excel('sample.xlsx',sheet_name='my_sheet',usecols=['name','address'])
    return df1, df2
print()

print(read_table())
print(read_col()[0])
print(read_col()[1])
