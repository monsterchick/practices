'''
訪問者模式是一種行為型設計模式，它允許你將算法從其所應用的對象中分離出來。
通過這種方式，可以在不修改對象本身的情況下添加新的操作或算法。
'''


class Robot:
    # 機器人程序的入口
    def __init__(self, name):
        self.name = name

    def accept(self, visitor):
        visitor.visit(self)


'''機器人子類1'''
class CleaningRobot(Robot):
    def clean(self):
        print(f"{self.name} is cleaning...")


'''機器人子類2'''
class PaintingRobot(Robot):
    def paint(self):
        print(f"{self.name} is painting...")


'''機器人子類3'''
class InspectionRobot(Robot):
    def inspect(self):
        print(f"{self.name} is inspecting...")


class UpgradeVisitor:
    def visit(self, robot):
        if isinstance(robot, CleaningRobot):
            robot.clean()
        elif isinstance(robot, PaintingRobot):
            robot.paint()
        elif isinstance(robot, InspectionRobot):
            robot.inspect()
        else:
            print("Unknown robot type.")


if __name__ == '__main__':
    robots = [CleaningRobot("Cleaner"), PaintingRobot("Painter"), InspectionRobot("Inspector")]
    # 實例化UpgradeVisitor
    visitor = UpgradeVisitor()
    for robot in robots:
        robot.accept(visitor)
