#########DEV1##########33
# Take numbers from the user
num1 = input("Enter first number: ")
num2 = input("Enter second number: ")

# Convert input strings to integers and add them
sum_result = int(num1) + int(num2)

# Print the result using an f-string
print(f"The sum of {num1} and {num2} is {sum_result}")

###################DEV2###############3
import random

# Generate a random integer between 1 and 20
secret_number = random.randint(1, 20)
attempts = 0

print("I am thinking of a number between 1 and 20.")

while True:
    guess = int(input("Take a guess: "))
    attempts += 1

    if guess < secret_number:
        print("Your guess is too low.")
    elif guess > secret_number:
        print("Your guess is too high.")
    else:
        print(f"Good job! You guessed my number in {attempts} attempts!")
        break  # Exit the loop

#######################DEV3#######################3333
text = "apple banana apple cherry banana apple"

# Split the string into a list of individual words
words = text.split()

# Create an empty dictionary to store counts
word_counts = {}

for word in words:
    if word in word_counts:
        word_counts[word] += 1  # Increment count if word exists
    else:
        word_counts[word] = 1   # Initialize count to 1 if it is new

print("Word Frequencies:")
print("word_counts)"
print("DEV3 code is modified and corrected")

######################DEV4###############################3
# Python Program to convert temperature in celsius to fahrenheit

# change this value for a different result
celsius = 37.5

# calculate fahrenheit
fahrenheit = (celsius * 1.8) + 32
print('%0.1f degree Celsius is equal to %0.1f degree Fahrenheit' %(celsius,fahrenheit))

This file is updated
      This file is again updated
