angle = int(input("Please enter an angle in degrees (from 0-360) assuming the angle is in standard position: "))
if angle>=0 and angle<=360:
   if angle==0 or angle==360:
       print("\n The angle lies on the Positive X Axis")
   if angle==90:
       print("\n The angle lies on the Positive Y Axis")
   if angle==180:
       print("\n The angle lies on the Negative X Axis")
   if angle==270:
       print("\n The angle lies on the Negative Y Axis")
   if angle>0 and angle<90:
       print("\n The angle lies in the First Quadrant")
   if angle>90 and angle<180:
       print("\n The angle lies in the Second Quadrant")
   if angle>180 and angle<270:
       print("\n The angle lies in the Third Quadrant")
   if angle>270 and angle<360:
       print("\n The angle lies in the Fourth Quadrant")
else:
    print("\nANGLE TOO HIGH! PLEASE TRY AGAIN!")    
exit()

    
