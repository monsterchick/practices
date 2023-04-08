import sys
from PySide6.QtCore import QSize, Qt
from PySide6.QtGui import QIcon, QPalette, QColor
from PySide6.QtWidgets import QApplication, QMainWindow, QMenuBar, QAction, QLabel, QStatusBar, QVBoxLayout, QWidget


class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()

        # 设置主窗口的标题和图标
        self.setWindowTitle("My Application")
        self.setWindowIcon(QIcon("icon.png"))

        # 设置主窗口的大小
        self.resize(QSize(400, 300))

        # 创建菜单栏
        menu_bar = QMenuBar(self)

        # 添加文件菜单
        file_menu = menu_bar.addMenu("文件")

        # 添加退出动作
        exit_action = QAction("退出", self)
        exit_action.triggered.connect(self.close)
        file_menu.addAction(exit_action)

        # 添加帮助菜单
        help_menu = menu_bar.addMenu("帮助")

        # 添加关于动作
        about_action = QAction("关于", self)
        about_action.triggered.connect(self.show_about_dialog)
        help_menu.addAction(about_action)

        # 添加主要部件
        central_widget = QWidget(self)
        central_layout = QVBoxLayout(central_widget)
        central_layout.setAlignment(Qt.AlignCenter)
        central_widget.setLayout(central_layout)

        label = QLabel("Hello, World!", central_widget)
        central_layout.addWidget(label)

        self.setCentralWidget(central_widget)

        # 设置状态栏
        status_bar = QStatusBar(self)
        status_bar.showMessage("Ready")
        self.setStatusBar(status_bar)

        # 设置主窗口的样式
        palette = self.palette()
        palette.setColor(QPalette.Window, QColor(53, 53, 53))
        palette.setColor(QPalette.WindowText, Qt.white)
        self.setPalette(palette)

    def show_about_dialog(self):
        # 显示关于对话框
        about_text = "This is a simple PySide6 application."
        QMessageBox.about(self, "关于", about_text)


if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec())
