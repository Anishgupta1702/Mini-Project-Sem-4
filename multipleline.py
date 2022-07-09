import matplotlib.pyplot as plt
z = input("Enter title for the graph: ")
x = input("Enter values on X-axis: ").split()
m = int(input("Enter no of lines: "))
for i in range(m):
    y = list(map(int, input("Enter values on Y-axis: ").split()))
    plt.plot(x, y)
plt.title(z)
plt.show()
