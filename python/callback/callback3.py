import tkinter as tk

def print_message():
    print("Hello, world!")

def do_calculation():
    # 执行一些计算，例如将两个数字相加
    result = 1 + 2
    print(f"The result is {result}")

def handle_button_click(callback):
    callback()

def main():
    root = tk.Tk()
    button1 = tk.Button(root, text="Print message", command=lambda: handle_button_click(print_message))
    button2 = tk.Button(root, text="Do calculation", command=lambda: handle_button_click(do_calculation))
    button1.pack()
    button2.pack()
    root.mainloop()

if __name__ == '__main__':
    main()
