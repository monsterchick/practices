import asyncio
import time


def download_data(data):
    time.sleep(1)
    print(f'正在保存{data}到本地...')
async def get_text():
    count = 0

    while count <= 5:
        print('正在請求網頁回應。。。')
        time.sleep(2)
        print('請求成功，撞狀態碼=200\n')

        download_data('圖片地址')

        count += 1
    print('爬取網頁完成！')


async def get_url():
    time.sleep(3)
    print('正在抓取所有url')
    print('已經把所有url保存到url_list中！\n')
    # 創建一個攜程
    task = asyncio.create_task(get_text())

    await task

asyncio.run(get_url())
