-- My name
name = "Anas Ahmed Elgarhy"
-- My age
age = 18
--[[print my name
and print my age
]]
print("Hi.\nMy name is " .. name .. " And my Age:" .. age .. " Years\n\n")

-- For loop
for i=1, 5, 1
do
	io.write(name .. " " .. i ..'\n')
end

-- While loop
a=10
while(a>0)
do
io.write("A = " .. a ..'\n')
a = a-1
end

-- Repeat ... until loop (do while loop in c)
a=10
repeat
io.write("A = " .. a .. '\n')
a= a + 1
until(a > 16)
