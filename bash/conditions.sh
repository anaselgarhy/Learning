#! /usr/bin/bash

NAME="Anas"

# Conditional statements are (if, elif, else)

# if
if [ "$NAME" == "Anas" ]
then
    echo "The name is Anas"
fi

# elif
if [ "$NAME" == "Anas" ]
then
    echo "Hi $NAME!"
elif [ "$NAME" == "Ahmed" ]
then
    echo "Hello Ahmed!"
fi

# else
if [ "$NAME" == "Anas" ]
then
    echo "The name is Anas"
else
    echo "The name is not Anas"
fi

# Comparison operators
# -eq, -ne, -gt, -lt, -le
# value1 -eq value2 - Test if value1 is equal to value2
# value1 -ne value2 - Test if value1 is not equal to value2
# value1 -gt value2 - Test if value1 is greater than value2
# value1 -lt value2 - Test if value1 is less than value2
# value1 -le value2 - Test if value1 is less than or equal to value2

read -p "Enter your age: " AGE

if [ $AGE -eq 18 ]
then
    echo "You are 18 years old"
elif [ $AGE -eq 19 ]
then
    echo "You are 19 years old"
elif [ $AGE -eq 20 ]
then
    echo "You are not 18 or 19 years old"
elif [ $AGE -gt 19 ]
then
    echo "You are over 19 years old"
elif [ $AGE -lt 20 ]
then
    echo "You are under 20 years old"
elif [ $AGE -ge 20 ]
then
    echo "You are over or equal to 20 years old"
fi

