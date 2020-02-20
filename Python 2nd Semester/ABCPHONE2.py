print("Welcome to ABC Telephone Company!\nThese are the company charges for the following rates below:")
print("\t\t\t\tRate per 3 minutes or less\n\t\t\t\tType of Call")
print("Time of Call\tSame Network(S)\tOtherNetwork(O)\tInternational(I)")
print("Day Call(D)\tP 6.75\t\tP 8.75\t\tP 25.65\nNight Call(N)\tP.6.25\t\tP 7.50\t\tP 23.30")
callTime = input("\nPlease enter the time of call(D/N): ")
callTime = callTime.upper()
callLength = float(input("Please enter the length of call in minutes: "))
callType = input("Please enter the type of call(S/O/I): ")
callType = callType.upper()
if callTime=='D' and callType=='S':
    total=6.75*(callLength/3)
    net=total+(total*0.1)
    print("The total charge is P","%.2f"%total," and the net charge is P","%.2f"%net)
elif callTime=='N' and callLength<=20 and callType=='S':
    total=6.25*(callLength/3)
    net=total+(total*0.1)
    print("The total charge is P","%.2f"%total," and the net charge is P","%.2f"%net)
elif callTime=='N' and callLength>20 and callType=='S':
    total=(6.25*(callLength/3))*0.9
    net=total+(total*0.1)
    print("The total charge is P","%.2f"%total," and the net charge is P","%.2f"%net)
elif callTime=='D' and callType=='O':
    total=8.75*(callLength/3)
    net=total+(total*0.1)
    print("The total charge is P","%.2f"%total," and the net charge is P","%.2f"%net)
elif callTime=='N' and callLength<=20 and callType=='O':
    total=7.50*(callLength/3)
    net=total+(total*0.1)
    print("The total charge is P","%.2f"%total," and the net charge is P","%.2f"%net)
elif callTime=='N' and callLength>20 and callType=='O':
    total=(7.50*(callLength/3))*0.9
    net=total+(total*0.1)
    print("The total charge is P","%.2f"%total," and the net charge is P","%.2f"%net)
elif callTime=='D' and callType=='I':
    total=25.65*(callLength/3)
    net=total+(total*0.1)
    print("The total charge is P","%.2f"%total," and the net charge is P","%.2f"%net)
elif callTime=='N' and callLength<=20 and callType=='I':
    total= 23.30*(callLength/3)
    net=total+(total*0.1)
    print("The total charge is P","%.2f"%total," and the net charge is P","%.2f"%net)
elif callTime=='N' and callLength>20 and callType=='I':
    total=(23.30*(callLength/3))*0.9
    net=total+(total*0.1)
    print("The total charge is P","%.2f"%total," and the net charge is P","%.2f"%net)
else:
    print("ERROR! PLEASE INPUT AGAIN!")
exit()    
