#!/bin/bash

echo "Do you like the coffee?"
read coffee

if [[ $coffee == "y" ]]; then
  echo "You're awesome!"
else
  echo "Leave right now!"
fi


