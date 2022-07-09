choice = int(input("\n1.Bar Graph\n2.Line Graph\n3.Double Bar Graph\n4.Multiple Line Graph\n0.Exit\nEnter your choice: "))
while(choice != 0):
    if choice == 1:
        exec(open('bar.py').read())
    elif choice == 2:
        exec(open('line.py').read())
    elif choice == 3:
        exec(open('doublebar.py').read())
    elif choice == 4:
        exec(open('multipleline.py').read())
