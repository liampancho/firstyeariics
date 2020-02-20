import math
x=float(input('Input X: '))
y=float(input('Input Y: '))
z=float(input('Input Z: '))
b=((-y-math.sqrt(abs(y*y-4*x*z)))/(2*x+y))+math.log10(3*pow(x,1/4))
c=x*pow(1+y/z,z*x)
d=(pow(math.exp(1),4*x*y))+(3*math.log(x))/(2*y)
print('Value b: ',b,'\nValue c: ',c,'\nValue d: ',d)
