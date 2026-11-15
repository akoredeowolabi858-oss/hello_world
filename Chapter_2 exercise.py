Question 1


x = 2
y = 3

print('x =', x)
print('Value of', x, '+', x, 'is', (x + x))
print('x =')
print((x + y), '=', (y + x))

Question 2
rating = int(input('Enter an integer rating between 1 and 10: '))

Question 3
grade = 91

if grade >= 90:
    print('Congratulations! Your grade of', grade, 'earns you an A in this course.')

Question 4
print(27.5 + 2)
print(27.5 - 2)
print(27.5 * 2)
print(27.5 / 2)
print(27.5 // 2)
print(27.5 ** 2)


Question 5
radius = 2
pi = 3.14159

diameter = 2 * radius
circumference = 2 * pi * radius
area = pi * radius ** 2

print('Diameter =', diameter)
print('Circumference =', circumference)
print('Area =', area)

Question 6
number = int(input('Enter an integer: '))

if number % 2 == 0:
    print('Even')
else:
    print('Odd')

Question 7
if 1024 % 4 == 0:
    print('1024 is a multiple of 4')

if 2 % 10 == 0:
    print('2 is a multiple of 10')
else:
    print('2 is not a multiple of 10')
print('number\tSquare\tcube')


Question 8
for number in range(0, 6):
    square = number ** 2
    cube = number ** 3
    print(number,"\t", square,"\t",cube)


Question 9

print(ord('B'))
print(ord('C'))
print(ord('D'))
print(ord('b'))
print(ord('c'))
print(ord('d'))
print(ord('0'))
print(ord('1'))
print(ord('2'))
print(ord('$'))
print(ord('*'))
print(ord('+'))
print(ord(' '))

Question 10

num1 = int(input('Enter first integer: '))
num2 = int(input('Enter second integer: '))
num3 = int(input('Enter third integer: '))

total = num1 + num2 + num3
average = total / 3
product = num1 * num2 * num3
smallest = min(num1, num2, num3)
largest = max(num1, num2, num3)

print('Sum =', total)
print('Average =', average)
print('Product =', product)
print('Smallest =', smallest)
print('Largest =', largest)


Question 11
number = int(input('Enter a five-digit number: '))

digit1 = number // 10000
digit2 = (number // 1000) % 10
digit3 = (number // 100) % 10
digit4 = (number // 10) % 10
digit5 = number % 10

print(digit1,"  ", digit2, "  ",digit3, "  ",digit4, "  ",digit5,)


Question 12
p = 1000
r = 0.07

amount10 = p * (1 + r) ** 10
amount20 = p * (1 + r) ** 20
amount30 = p * (1 + r) ** 30

print('After 10 years =', round(amount10,0))
print('After 20 years =', round(amount20,0))
print('After 30 years =', round(amount30,0))


Question 13
number = 2 ** 10000
print(number)

Question 14

Question 15
num1 = float(input('Enter first number: '))
num2 = float(input('Enter second number: '))
num3 = float(input('Enter third number: '))

if num1 <= num2 and num1 <= num3:
    smallest = num1
    if num2 <= num3:
        middle = num2
        largest = num3
    else:
        middle = num3
        largest = num2

elif num2 <= num1 and num2 <= num3:
    smallest = num2
    if num1 <= num3:
        middle = num1
        largest = num3
    else:
        middle = num3
        largest = num1

else:
    smallest = num3
    if num1 <= num2:
        middle = num1
        largest = num2
    else:
        middle = num2
        largest = num1

print('Ascending order:', smallest, middle, largest)
