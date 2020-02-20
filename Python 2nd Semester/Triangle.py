import math
b=float(input('Enter Side b: '))
c=float(input('Enter Side c: '))
A=float(input('Enter Angle A: '))
degrees=3.1416/180
radians=180/3.1416
a=math.sqrt(pow(b,2)+pow(c,2)-2*b*c*math.cos(A*degrees))
B=math.asin(b*math.sin(A*degrees)/a)*radians
C=180-(A+B);
s=(a+b+c)/2
Area=math.sqrt(s*(s-a)*(s-b)*(s-c))
M=(1/2)*math.sqrt(2*pow(a,2)+2*pow(c,2)-pow(b,2))
N=(1/2)*math.sqrt(2*pow(b,2)+2*pow(c,2)-pow(a,2))
P=(1/2)*math.sqrt(2*pow(a,2)+2*pow(b,2)-pow(c,2))
print('\nSide a = ',a,'\nAngle B = ',B,'\nAngle C = ',C,'\nArea = ',Area)
print('\nLengths of the Medians\nM = ',M,'\nN = ',N,'\nP = ',P)

