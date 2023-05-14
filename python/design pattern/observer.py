'''
用于处理对象之间的依赖关系。在这种模式中，
一个对象（称为主题或可观察对象）维护一组依赖于它的对象（称为观察者），
并在状态发生变化时通知它们。
'''

class Subject:
    def __init__(self):
        self.observers = []
        self.debt = {}

    # attach(observer): 将一个观察者对象添加到主题对象的观察者列表中。
    def attach(self,observer):
        self.observers.append(observer)

    # detach(observer): 将一个观察者对象从主题对象的观察者列表中移除。
    def detach(self, observer):
        if observer in self.observers:
            self.observers.remove(observer)
        else:
            print(f'{observer.name} 不在觀察者列表中')
    def notify(self):
        for observer in self.observers:
            if observer.name in self.debt:
                observer.update(f'老王还了钱，他欠你 {self.debt[observer.name]} 元')
            else:
                observer.update(f'老王還了錢，但你沒有欠款')
    # 用于维护借款金额的字典（debt）
    def add_debt(self, name, amount):
        self.debt[name] = amount
        print(f'老王總共欠{name}{self.debt[name]}元')

    # repay(amount): 主题对象（借款人）还款的方法。该方法会更新主题对象的状态（即借款金额减少），
    # 并通知所有观察者对象（即借款人的债权人）状态已经发生改变。
    def repay(self, name, amount):
        self.debt[name] -= amount
        # print(self.debt[name])
        self.notify()

class Observer:
    def __init__(self,name):
        self.name = name
        # print(name)

    def update(self,message):
        print(f'{self.name}: {message}')

def obs_zhangsan():
    # 创建观察者对象
    obs_zs = Observer("張三")

    sb = Subject()
    # 创建主题对象(欠款debt）
    sb.add_debt('張三', 10000)

    # 将观察者对象添加到主题对象的观察者列表中
    sb.attach(obs_zs)

    # 老王还了钱，更新主题对象的状态并通知所有观察者对象
    sb.repay('張三',1000)
    sb.repay('張三',500)

    # 将一个观察者对象从主题对象的观察者列表中移除
    sb.detach(obs_zs)

    # obs_ls = Observer('李四')
    # sb.add_debt('李四',9999)
    # sb.attach(obs_ls)
    # sb.repay('李四',119)
    # sb.detach(obs_ls)

obs_zhangsan()