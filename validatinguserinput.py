passes = 0

for _ in range(10):

	while True:
		result = int(input("Enter result (1 for pass and 2 for fail): "))
	
		if result == 1:
			print("Passed")
			passes = passes + 1
			break
		elif result == 2:
			print('Failed')
			break
		else :
			print("Incorrect Input. Try again")
		


print("Passed: ", passes)
print("Failed: ", 10 - passes)

if passes > 8:
	print("Bonus to the Teacher")