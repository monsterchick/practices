import pandas as pd


class WriteDataToExcel:
    def __init__(self):
        pass

    def read_excel(self):
        # 讀取excel數據
        df = pd.read_excel('sample.xlsx',sheet_name='my_sheet')
        return df
    def calcul_average(self,df):

        # 計算科目平均值
        everage = df[['chinese','math','english']].mean(axis=1)
        # print(type(everage))    # type series
        return everage

    def get_last_col_index(self, df):
        last_col_index = len(df.columns)
        # print(last_col_index)
        return last_col_index
    def write_to_excel(self, df, average):
        try:
            # 獲取最後一列的index
            last_col_index = self.get_last_col_index(df)
            # 插入新列
            df.insert(last_col_index, 'average', average)
            # 把數據正式寫入excel文件
            df.to_excel('sample.xlsx', sheet_name='my_sheet',index=False)
            print('寫入成功！！！')
        except ValueError:
            print('average已經存在！')

    def start(self):
        # 讀取excel數據和計算平均數
        df = self.read_excel()
        # 計算科目平均值
        average = self.calcul_average(df)
        # 把平均數寫入excel中
        self.write_to_excel(df, average)



# print(write.calcul_average()[0])
WriteDataToExcel().start()