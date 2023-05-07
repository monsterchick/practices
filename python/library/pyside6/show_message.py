import sys
from PySide6.QtWidgets import QApplication, QMainWindow, QLabel


class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()

        # 设置主窗口的标题和大小
        self.setWindowTitle("My Window")
        self.setGeometry(100, 100, 400, 300)

        # 添加标签部件
        label = QLabel("Hello, World!", self)
        label.move(150, 130)

        # 显示窗口
        self.show()


if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = MainWindow()
    sys.exit(app.exec())
