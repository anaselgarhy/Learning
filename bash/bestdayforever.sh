#!/bin/bash
name="$1"
complement="$2"

user=$(whoami)
current_dir=$(pwd)
current_date=$(date +%Y-%m-%d)

echo "Goodmorning $name"
sleep 1
echo "You're looking good today $name"
sleep 1
echo "You have the best $complement I've ever seen $name"
sleep 3

echo "Your logined user is $user"
echo "Your current directory is $current_dir"
echo "Today's date is $current_date"
