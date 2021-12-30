# Input
name = input("Please enter your name: ")
age = input("Please enter your age: ")
# Formatting
# Name
name = name.title().strip()
# age
age = age.strip()
# Output
print("Hello {}".format(name))
print(f"Your age is {age}")
