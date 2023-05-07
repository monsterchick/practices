import asyncio
import time

async def print_numbers():
    for i in range(10000):
        print(i)
        await asyncio.sleep(0)

async def main():
    start_time = time.time()  # 记录开始时间
    task = asyncio.create_task(print_numbers())
    await task
    end_time = time.time()  # 记录结束时间
    elapsed_time = end_time - start_time  # 计算运行时间
    print(f"程序运行时间为：{elapsed_time}秒")

asyncio.run(main())
