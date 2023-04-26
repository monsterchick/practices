from PySide6.QtWidgets import QApplication, QWidget, QVBoxLayout, QLineEdit, QPushButton, QLabel

class MyWidget(QWidget):
    def __init__(self):
        super().__init__()

        # Create the input box
        self.input_box = QLineEdit()

        # Create the button and connect it to a function that displays the input text
        self.button = QPushButton("Display Input")
        self.button.clicked.connect(self.display_input)

        # Create the label that will display the input text
        self.display_label = QLabel()

        # Add the input box, button, and label to a vertical layout
        layout = QVBoxLayout()
        layout.addWidget(self.input_box)
        layout.addWidget(self.button)
        layout.addWidget(self.display_label)

        # Set the layout for the widget
        self.setLayout(layout)

    def display_input(self):
        # Get the text from the input box and display it in the label
        input_text = self.input_box.text()
        self.display_label.setText(input_text)

# Create the application and widget, then show the widget
app = QApplication([])
widget = MyWidget()
widget.show()
app.exec_()