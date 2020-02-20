import math
magnitudeOne=float(input('Enter first magnitude: '))
directionOne=float(input('Enter first direction: '))
magnitudeTwo=float(input('Enter second magnitude: '))
directionTwo=float(input('Enter second direction: '))
magnitudeThree=float(input('Enter third magnitude: '))
directionThree=float(input('Enter third direction: '))
radiansToDegrees=3.1416/180
degreesToRadians=180/3.1416
Ax=magnitudeOne*math.cos(directionOne*radiansToDegrees) 
Ay=magnitudeOne*math.sin(directionOne*radiansToDegrees)
Bx=magnitudeTwo*math.cos(directionTwo*radiansToDegrees)
By=magnitudeTwo*math.sin(directionTwo*radiansToDegrees)
Cx=magnitudeThree*math.cos(directionThree*radiansToDegrees)
Cy=magnitudeThree*math.sin(directionThree*radiansToDegrees)
Rx=Ax+Bx+Cx
Ry=Ay+By+Cy
Resultant=(math.sqrt(pow(Rx,2)+pow(Ry,2)))
Direction=(math.atan(Ry/Rx))*(degreesToRadians)
print('The Resultant is: ',"%.2f"%Resultant,'\nThe Direction is: ',"%.2f"%Direction)
exit()

