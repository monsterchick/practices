class Car:
    def __init__(self):
        self.make = None
        self.model = None
        self.year = None
        self.color = None

    # 使用 print(car) 時，Python 會呼叫 car 物件的 __str__ 方法來產生該物件的字串表示形式，然後顯示出該字串。
    def __str__(self):
        return f"{self.year} {self.make} {self.model} ({self.color})"


class CarBuilder:
    def __init__(self):
        self.car = Car()

    def set_make(self, make):
        self.car.make = make
        return self

    def set_model(self, model):
        self.car.model = model
        return self

    def set_year(self, year):
        self.car.year = year
        return self

    def set_color(self, color):
        self.car.color = color
        return self

    def build(self):
        return self.car


builder = CarBuilder()
car = builder.set_make("Toyota").set_model("Camry").set_year(2021).set_color("red").build()
print(car)
