#include <iostream>

using namespace std;

int main() {

	unsigned int n;
	unsigned long int k;
	cin >> n;

	for (unsigned int i=0; i<n; i++) {
		cin >> k;
		k -= 1;
		k *= 2;
		if (int(sqrt(k))*(int(sqrt(k)) + 1) == k) {
			cout << 1 << " ";
		} else {
			cout << 0 << " ";
		}

	}
	

	return 0;
}