num1 = float(input('Enter number one: '))
num2 = float(input('Enter number tow: '))
# sum
print("{0} + {1} = {2}".format(num1, num2, num1 + num2))
# Subtraction
print("{} - {} = {}".format(num1, num2, num2 - num2))
# Product
print("{} x {} = {}".format(num1, num2, num1 * num2))
# The quotient
r = num1 / num2
if r % 2 == 1:
    print("{} / {} = {}".format(num1, num2, r))
else:
    print("{} % {} = {}".format(num1, num2, num1 % num2))
