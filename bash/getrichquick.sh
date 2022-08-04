#!/bin/bash

echo "What is your name?"
read name
echo "What is your age?"
read age

rich_age=$(( ($RANDOM % 15) + $age ))   # $(( )) is a special bash command that does math

echo "Hello $name, you are $age years old, you will be rich in $rich_age years"
