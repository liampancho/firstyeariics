x = int(input("Enter a point on the x axis: "))
y = int(input("Enter a point on the y axis: "))

origin = x==0 and y==0

firstQuadrant = x>0 and y>0
secondQuadrant = x<0 and y>0
thirdQuadrant = x<0 and y<0
fourthQuadrant = x>0 and y<0

positiveXAxis = x>0 and y==0
negativeXAxis = x<0 and y==0
positiveYAxis = x==0 and y>0
negativeYAxis = x==0 and y<0

if firstQuadrant:
    print("\nThe coordinates lie in the First Quadrant")
if secondQuadrant:
    print("\nThe coordinates lie in the Second Quadrant")
if thirdQuadrant:
    print("\nThe coordinates lie in the Third Quadrant")
if fourthQuadrant:
    print("\nThe coordinates lie in the Fourth Quadrant")
if positiveXAxis:
    print("\nThe coordinates lie at the Positive X Axis")
if negativeXAxis:
    print("\nThe coordinates lie at the Negative X Axis")
if positiveYAxis:
    print("\nThe coordinates lie at the Positive Y Axis")
if negativeYAxis:
    print("\nThe coordinates lie at the Negative Y Axis")
if origin:
    print("\nThe coordinates lie at the Origin")    
