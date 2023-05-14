'''
Adapter 模式是一種設計模式，用於將一個類別的介面轉換為另一個介面，以便不相容的類別可以協同工作。
'''

import math


class Square:
    def __init__(self, side):
        self.side = side

    def calculate_area(self):
        return self.side ** 2


class Circle:
    def __init__(self, radius):
        self.radius = radius

    def calculate_area(self):
        return math.pi * (self.radius ** 2)


class CircleAdapter:
    def __init__(self, circle):
        self.circle = circle

    def calculate_area(self):
        return self.circle.calculate_area()

    @property
    def side(self):
        return math.sqrt(self.circle.calculate_area())

# 比起其它設計模式， adapter 給class增加了參數
square = Square(4)
print(f"Square area: {square.calculate_area()}")

circle = Circle(5)
circle_adapter = CircleAdapter(circle)
print(f"Circle area: {circle_adapter.calculate_area()}")

print(f"Circle side (approximate): {circle_adapter.side}")
