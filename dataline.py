import matplotlib.pyplot as plt
import pandas as pd
import sys

file1 = sys.argv[1]
print(file1)
print(len(sys.argv))
var = pd.read_excel(file1)
x = list(var['X values'])
y = list(var['Y values'])

plt.plot(x,y,color='green',marker='o',markerfacecolor='blue',markersize=8)

plt.savefig('C:\\plot\\myplot.png')
plt.show()
