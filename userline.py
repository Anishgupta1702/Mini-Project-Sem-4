import matplotlib.pyplot as plt
import sys

n = len(sys.argv)
print(n,end='\n')
print("\nArguments passed:", end = " ")
for i in range(1, n):
    print(sys.argv[i], end = " ")

values = []
for i in range(1,n):
    val = sys.argv[i]
    val = int(val)
    values.append(val)
print(values,end='\n')
x = []
y = []
length = len(values)
half = int(length/2)
for i in range(0,half):
    x.append(values[i])
for i in range(half,length):
    y.append(values[i])

plt.plot(x,y)
plt.show()