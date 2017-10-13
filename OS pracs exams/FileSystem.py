import os
while(True):
    x=os.getcwd()
    y=input(x+">")
    cmd=y.split(' ')
    if(cmd[0]=="exit"):
        break
    elif(cmd[0]=="ls"):
        z=os.listdir()
        for i in z:
            print(i)
    elif(cmd[0]=="mkdir"):
        os.mkdir(cmd[1])
    elif(cmd[0]=="rmdir"):
        try:
            os.rmdir(cmd[1])
        except FileNotFoundError:
            print("File is not present")
    elif(cmd[0]=="cd"):
        try:
            os.chdir(cmd[1])
        except FileNotFoundError:
            print("File is not present")
    elif (cmd[0]=="mv"):
        try:
            os.rename(cmd[1],cmd[2])
        except FileNotFoundError:
            print("File is not present")
    elif (cmd[0]=="cat"):
        try:
            f=open(cmd[1],"r")
            print(f.read())
            f.close()
        except FileNotFoundError:
            print("File is not present")
    elif (cmd[0]=="rm"):
        try:
            os.remove(cmd[1])
        except FileNotFoundError:
            print("File is not present")
    else:
        print("Unknown command")
