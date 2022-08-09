import matplotlib.pyplot as plt
import sys

n = len(sys.argv)
dataset = []
m = int(n/2+1)
for i in range(1,m):
    val = sys.argv[i]
    dataset.append(val)

values = []
for i in range(m,n):
    val = sys.argv[i]
    values.append(val)

plt.pie(values,labels=dataset)
plt.show