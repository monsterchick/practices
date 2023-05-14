'''
結構型數據模式
'''


from abc import ABC, abstractmethod


# Shape是所有圖形的基礎接口
class Shape(ABC):
    '''@abstractmethod是Python中的一個裝飾器, 用來在python中定義接口的'''
    @abstractmethod
    def draw(self):
        pass


# 矩形
class Rectangle(Shape):
    def draw(self):
        print("Drawing a rectangle")


# 圓形
class Circle(Shape):
    def draw(self):
        print("Drawing a circle")


# 線條
class Line(Shape):
    def draw(self):
        print("Drawing a line")


# CompositeShape包含多個Shape對象，可以包含其他CompositeShape對象
class CompositeShape(Shape):
    def __init__(self):
        self.shapes = []

    def add_shape(self, shape):
        self.shapes.append(shape)

    def draw(self):
        for shape in self.shapes:
            shape.draw()


# 創建一個CompositeShape對象，添加一些Shape對象
composite = CompositeShape()
composite.add_shape(Rectangle())
composite.add_shape(Circle())
composite.add_shape(Line())

# 創建另一個CompositeShape對象，添加其他Shape對象和前面創建的CompositeShape對象
composite2 = CompositeShape()
composite2.add_shape(Rectangle())
composite2.add_shape(composite)

# 調用CompositeShape對象的draw()方法
composite2.draw()
