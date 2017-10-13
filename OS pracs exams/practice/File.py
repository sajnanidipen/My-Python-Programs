import os
while (True):
    x=os.getcwd()
    y=input(x+">")
    cmd=y.split(' ')
    if(cmd[0]=="exit"):
        break
    elif cmd[0]=="ls":
        z=os.listdir()
        for i in z:
            print (i)
    else:
        print ("Unknown Command")
