print("Welcome to the ABC shipping company!")

weight = int(input("Please enter the package weight(in 1 to 20 kg only): "))
packageType = input("Please enter the package type(A or B): ")
packageType = packageType.upper()
distance = int(input("Please enter the distance(in km): "))

if packageType=='A' and weight<=5:
    charge=weight*10.50*distance
    total=charge+(charge*0.1)
    print("\nThe Charge is: P",float("%.2f"%charge),"\nAnd the Total Charge is: P",float("%.2f"%total))

elif packageType=='A' and weight>5 and weight<=10:
    charge=weight*15.75*distance
    total=charge+(charge*0.1)
    print("\nThe Charge is: P",float("%.2f"%charge),"\nAnd the Total Charge is: P",float("%.2f"%total))

elif packageType=='A' and weight>10 and weight<=20:
    charge=weight*20.65*distance
    total=charge+(charge*0.1)
    print("\nThe Charge is: P",float("%.2f"%charge),"\nAnd the Total Charge is: P",float("%.2f"%total))

elif packageType=='B' and weight<=5:
    charge=weight*11.75*distance
    total=charge+(charge*0.1)
    print("\nThe Charge is: P",float("%.2f"%charge),"\nAnd the Total Charge is: P",float("%.2f"%total))

elif packageType=='B' and weight>5 and weight<=10:
    charge=weight*18.50*distance
    total=charge+(charge*0.1)
    print("\nThe Charge is: P",float("%.2f"%charge),"\nAnd the Total Charge is: P",float("%.2f"%total))

elif packageType=='B' and weight>10 and weight<=20:
    charge=weight*23.65*distance
    total=charge+(charge*0.1)
    print("\nThe Charge is: P",float("%.2f"%charge),"\nAnd the Total Charge is: P",float("%.2f"%total))

else:
    print("ERROR! PLEASE TRY AGAIN!")
exit()    

