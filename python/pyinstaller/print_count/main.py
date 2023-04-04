import time
from count import num

def print_info(number):
    print(f'This windows will be closed in {number} seconds')
    time.sleep(1)

if __name__ == '__main__':
    for i in range(num):
        print_info(num)
        num -= 1

