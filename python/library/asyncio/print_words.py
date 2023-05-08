import asyncio
import time


async def print_hello():
    '''透過在每次迴圈中休眠 2 秒鐘來模擬一個耗時的任務'''
    for i in range(10):
        time.sleep(2)
        print('hello ')


async def print_world():
    '''
    因為print_hello()很耗費時間，所以加await關鍵詞，允許其它動作先去執行
    使用await print_hello() 時，它會暫停 print_world() 的執行直到 print_hello() 完成為止
    '''
    task = asyncio.create_task(print_hello())
    print('world.')
    await task


'''這個叫攜程coroutine'''
asyncio.run(print_world())
