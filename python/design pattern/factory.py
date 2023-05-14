'''Worker类被定义为一个抽象基类，即只是为了定义一个公共接口do_job()'''
class Worker():
    def __init__(self):
        pass
    def do_job(self):
        pass

# Worker1 中的worker繼承自父類Worker
class Worker1(Worker):
    # 類似於kotlin裡面的override
    def do_job(self):
        return f'I am Worker1 and doing job1'

class Worker2(Worker):
    def do_job(self):
        return f'I am Worker2 and doing job2'

class WorkerFactory:
    @staticmethod
    def create_worker(worker_type):
        if worker_type == 'Worker1':
            return Worker1()
        elif worker_type == 'Worker2':
            return Worker2()
        else:
            raise ValueError(f'Unknown worker type: {worker_type}')

def work(worker_type=''):
    worker = WorkerFactory().create_worker(worker_type)
    print(worker.do_job())


# 叫工人1幹活兒
work('Worker1')

# 叫工人2幹活兒
work('Worker2')