import pandas as pd
import matplotlib.pyplot as plt
choice = int(input("\n1.Birth Rate\n2.Death Rate\n3.Fertility Rate\n4.GDP\n5.GDP Growth rate\n6.Infant Mortality Rate\n7.Life Expectancy\n8.Literacy Rate\n9.Population\n10.Population Growth Ra\nEnter your choice: "))
if choice == 1:
    var = pd.read_excel(r'Data\birthrate.xlsx')
    z = 'Birth Rate in India'
elif choice == 2:
    var = pd.read_excel(r"Data\deathrate.xlsx")
    z = 'Death Rate in India'
elif choice == 3:
    var = pd.read_excel(r"Data\fertilityrate.xlsx")
    z = 'Fertility Rate in India'
elif choice == 4:
    var = pd.read_excel(r"Data\gdp.xlsx")
    z = 'GDP of India'
elif choice == 5:
    var = pd.read_excel(r"Data\gdpgrowthrate.xlsx")
    z = 'GDP Growth Rate in India'
elif choice == 6:
    var = pd.read_excel(r"Data\infantmortalityrate.xlsx")
    z = 'Infant Mortality Rate in India'
elif choice == 7:
    var = pd.read_excel(r"Data\lifeexpectancy.xlsx")
    z = 'Life Expectancy in India'
elif choice == 8:
    var = pd.read_excel(r"Data\literacyrate.xlsx")
    z = 'Literacy Rate in India'
elif choice == 9:
    var = pd.read_excel(r"Data\population.xlsx")
    z = 'Population of India'
elif choice == 10:
    var = pd.read_excel(r"Data\populationgrowthrate.xlsx")
    z = 'Poulation Growth Rate in India'
x = list(var['X values'])
y = list(var['Y values'])
choice1 = int(input("\n1.Line Graph\n2.Bar Graph\nEnter your choice: "))
if choice1 == 1:
    plt.plot(x,y)
if choice1 == 2:
    plt.bar(x,y,color = 'cyan')
plt.title(z)
plt.show()
