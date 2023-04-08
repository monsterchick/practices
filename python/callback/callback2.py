def process_numbers(numbers, callback):
    for number in numbers:
        result = callback(number)
        print(f"The result of {number} is {result}")

def square(number):
    return number ** 2

def cube(number):
    return number ** 3

numbers = [1, 2, 3, 4, 5]

process_numbers(numbers, square)
process_numbers(numbers, cube)