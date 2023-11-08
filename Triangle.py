n = int(input())

for i in range(0, n):
	a, b, c = [int(x) for x in input().split()]
	# print(type(a))
	if ((a+b >= c) and (b+c >= a) and (c+a >= b)):
		print(a+b+c)
	else:
		print(-1)
