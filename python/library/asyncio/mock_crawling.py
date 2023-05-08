import asyncio


url_list = [1,2,3,4,5,6,7,8,9,10]

async def download_data(res):
    print(f'正在保存{res}...')
    print('保存成功！')

async def get_resp(url_list):
    tasks = []
    for url in url_list:
        print(f'正在請求url: {url}')
        res = '響應'
        task = asyncio.create_task((get_resp(url)))
        tasks.append(task)
        await asyncio.gather(*tasks)
        print('testing gatheeer!')

get_resp(url_list)
