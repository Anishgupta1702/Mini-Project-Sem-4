choice = int(input("\n1.Inbuilt Data\n2.Enter own Data\n0.Exit\nEnter your choice: "))
while(choice != 0):
    if choice == 1:
        exec(open('main1.py').read())
    if choice == 2:
        exec(open('main2.py').read())
    choice = int(input("\n1.Inbuilt Data\n2.Enter own Data\n0.Exit\nEnter your choice: "))
