#include <iostream>

using namespace std;

int main() {
	int n, k;
	long int a, b, c, max = 0;
	//long int a[1000];
	cin >> n;
	cin >> a >> b >> c;
	if (a+b+c>max) {
		max = a + b + c;
		k = 2;
	}
	for (int i=3; i<n; i++) {
		a = b;
		b = c;
		cin >> c;
		if (a + b + c > max) {
			max = a + b + c;
			k = i;
		}
		
	}

	cout << max << ' ' << k;

	return 0;
}