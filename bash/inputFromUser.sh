#! /usr/bin/bash

# Read input from user
# Not need declare variable before read input
read -p "Enter yor name: " NAME
# -p for read from prompt
read -p "Enter your age: " AGE
read -p "Enter your money: " MONY

# Print output to user
echo "Hello $NAME"
echo "Your age is $AGE years old"
echo "Your money is $MONY dollars"
echo "Goodbye $NAME"
