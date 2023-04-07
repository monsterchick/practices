num1 = 1
num2 = 2


def test(callback):
    callback()


def action():
    res = num1 + num2
    print(f'result: {res}')


test(action)
