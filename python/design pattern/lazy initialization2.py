'''
The Lazy Initialization, also called Lazy Loading is a very simple but powerful
a creational design pattern that allows us to delay initialization of the object until it is needed.

这种延迟加载的方式可以节省资源。因为顾客的订单信息可能很多，
如果在 Customer 类初始化时就加载所有订单信息，会占用大量内存和计算资源。
而延迟加载的方式可以避免这种情况，只有在需要时才加载数据，从而避免浪费不必要的资源。
'''
class Customer:
    def __init__(self):
        self._orders = None

    def get_orders(self):
        if self._orders is None:
            self._orders = self._load_orders()
        return self._orders

    def _load_orders(self):
        print("loading orders")
        return []

customer = Customer()

customer.get_orders()
customer.get_orders()
customer.get_orders()
customer.get_orders()
customer.get_orders()
