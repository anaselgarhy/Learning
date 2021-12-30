import math

##
pi = math.pi
# functions
def Circle_area(x):
    return pi * math.pow(x, 2)


def Circle_circumference(x):
    return pi * 2 * x


###########
def Square_area(x):
    return x * 2 * x


def Square_perimeter(x):
    return x * 4


############

def Rectangle_area(x):
    return x * 2 * x


def Rectangle_perimeter(x):
    return (2 * x) + (2 * 2 * x)


#############

def Triangle_perimeter(x):
    return 3 * x


# Inputs
x = float(input("Please enter x: ").strip())
# Outputs
print(f'Area of circle = {Circle_area(x)}')
print(f'Circumference of circle = {Circle_circumference(x)}')
##########
print(f'Area of square = {Square_area(x)}')
print(f'Perimeter of square = {Square_perimeter(x)}')
#########
print(f'Area of rectangle = {Rectangle_area(x)}')
print(f'Perimeter of rectangle = {Rectangle_perimeter(x)}')
########
print(f'Perimeter of triangle = {Triangle_perimeter(x)}')


