#include <iostream>

using namespace std;

int main() {
	int n, k;
	cin >> n;
	cin >> k;
	if (k >= n) cout << 2;
	else if ((n*2)%k>0) {
		cout << (n * 2) / k + 1 << endl;
	} else {
		cout << (n * 2) / k << endl;
	}

	return 0;
}