from tabulate import tabulate

data = [
    ["John Doe", 25, "Male"],
    ["Jane Smith", 32, "Female"],
    ["Bob Johnson", 45, "Male"],
]

headers = ["Name", "Age", "Gender"]

table = tabulate(data, headers, tablefmt="pipe")

print(table)
