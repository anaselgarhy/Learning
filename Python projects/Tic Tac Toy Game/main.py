from tkinter import *
from tkinter import ttk

import b8 as b8

ActivePlayer=1
p1=[]
p2=[]

root=Tk()
root.title("Tic Tac Toy : Player 1")
style=ttk.Style()
style.theme_use('classic')

bu1=ttk.Button(root, text='')
bu1.grid(row=0, column=0, sticky='snew', ipadx=40, ipady=40)
bu1.config(command=lambda : BuClick(1))


bu2=ttk.Button(root,text='')
bu2.grid(row=0,column=1,sticky='snew',ipadx=40,ipady=40)
bu2.config(command=lambda : BuClick(2))

bu3=ttk.Button(root,text='')
bu3.grid(row=0,column=2,sticky='snew',ipadx=40,ipady=40)
bu3.config(command=lambda : BuClick(3))

bu4=ttk.Button(root,text='')
bu4.grid(row=1,column=0,sticky='snew',ipadx=40,ipady=40)
bu4.config(command=lambda : BuClick(4))

bu5=ttk.Button(root,text='')
bu5.grid(row=1,column=1,sticky='snew',ipadx=40,ipady=40)
bu5.config(command=lambda : BuClick(5))

b6=ttk.Button(root, text='')
b6.grid(row=1, column=2, sticky='snew', ipadx=40, ipady=40)
b6.config(command=lambda : BuClick(6))

b7=ttk.Button(root, text='')
b7.grid(row=2, column=0, sticky='snew', ipadx=40, ipady=40)
b7.config(command=lambda : BuClick(7))

b8=ttk.Button(root, text='')
b8.grid(row=2, column=1, sticky='snew', ipadx=40, ipady=40)
b8.config(command=lambda : BuClick(8))

b9=ttk.Button(root, text='')
b9.grid(row=2, column=2, sticky='snew', ipadx=40, ipady=40)
b9.config(command=lambda : BuClick(9))




def BuClick(id):
    global ActivePlayer
    global p1
    global p2
    if(ActivePlayer==1):
        SetLayout(id,'X')
        p1.append(id)
        root.title('Tic Tac Toy : Player 2')
        ActivePlayer=2
        print('p1{}'.format(p1))

    if (ActivePlayer == 2):
        SetLayout(id,'O')
        p2.append(id)
        root.title('Tic Tac Toy : Player 1')
        ActivePlayer = 1
        print('p2{}'.format(p2))

def SetLayout(id,text):
    if (id==1):
        #bu1.confing(text=text)
        bu1 = ttk.Button(root, text=text)
        bu1.state(['disabled'])

root.mainloop()