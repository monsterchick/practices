import asyncio
import time

def normally_print_nums(num):
    for i in range(1, num):
        print(i*2)

async def async_print_nums(num):
    for i in range(1,num):
        print(i*2)
        await asyncio.sleep(0)

async def main():
    num = 100001

    '''异步打印'''
    start_time = time.time()    # 记录开始时间
    task = asyncio.create_task(async_print_nums(num))
    await task
    end_time = time.time()  # 记录结束时间
    acy_elapsed_time = end_time -start_time
    # 异步打印的时间
    print(f'async elapsed time: {acy_elapsed_time}')

    '''正常打印'''
    t1 = time.time()
    normally_print_nums(num)
    t2 = time.time()
    gen_elap_time = t2 - t1

    # 正常打印的时间
    print(f'general elapsed time: {gen_elap_time}')

    if acy_elapsed_time < gen_elap_time:
        print(f'异步时间:{acy_elapsed_time} 同步时间:{gen_elap_time} 异步时间较短')
    elif acy_elapsed_time > gen_elap_time:
        print(f'异步时间:{acy_elapsed_time} 同步时间:{gen_elap_time} 同步时间较短')
    else:
        print('something wrong')

asyncio.run(main())
