import turtle as t
import  time as s
# Screen Setup
nw = t.Screen()
nw.title("Snake Game")
nw.bgcolor("blue")
nw.setup(width=600, height=600)
nw.tracer()
# Head Snake
head = t.Turtle()
head.color("red")
head.shape("square")
head.penup()
head.speed(0)
head.goto(0,0)

food = t.Turtle()
food.color("black")
food.shape("square")
food.goto(1, 20)


def go_up():
    head.direction ="up"
def go_down():
    head.direction ="down"
def go_left():
    head.direction ="left"
def go_right():
    head.direction ="right"

def move():
    if head.direction == "up":
        y=head.ycor()
        head.sety(y+20)
    if head.direction == "down":
        y = head.ycor()
        head.sety(y - 20)
    if head.direction == "left":
        x = head.xcor()
        head.sety(x - 20)
    if head.direction == "right":
        x = head.xcor()
        head.sety(x + 20)

nw.listen()
nw.onkeypress(go_up(), 'Up')
nw.onkeypress(go_down(), 'Down')
nw.onkeypress(go_left(), 'Left')
nw.onkeypress(go_right(), 'Right')

while True:
    nw.update()
    s.sleep(0.1)
    move()






nw.mainloop()

