import math
x=float(input('Input X value: '))
y=float(input('Input Y value: '))
z=float(input('Input Z value: '))
a=((-x-math.sqrt(y*y+4*x*z))/(3*z-y))+math.log10(3*pow(x,1/4))
b=x*pow(1+((2*y)/z),x/z)
c=(pow(math.exp(1),4*x+y))+(math.log(3*y))/(2*x)
print('Value a: ',"%.2f"%a,'\nValue b: ',"%.2f"%b,'\nValue c: ',"%.2f"%c)
exit()
