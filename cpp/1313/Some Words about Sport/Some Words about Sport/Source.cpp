#include <iostream>

using namespace std;

int main() {
	
	int n, a[100][100];
	cin >> n;
	for (int i=0; i<n; i++) {
		for (int j=0; j<n; j++) {
			cin >> a[i][j];
		}
	}

	for (int i=0; i<n; i++) {
		int p = i;
		while (p>=0) {
			cout << a[p][i - p] << " ";
			p -= 1;
		}
	}

	for (int i = 1; i<n; i++) {
		int p = i;
		while (p < n) {
			cout << a[n-p+i-1][p] << " ";
			p += 1;
		}
	}

	
	return 0;
}