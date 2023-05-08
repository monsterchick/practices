import asyncio

async def coro1():
    print("Start coro1")
    await asyncio.sleep(1)
    print("End coro1")
    return "result1"

async def coro2():
    print("Start coro2")
    await asyncio.sleep(2)
    print("End coro2")
    return "result2"

async def main():
    results = await asyncio.gather(coro1(), coro2())
    print(f"Results: {results}")

asyncio.run(main())
