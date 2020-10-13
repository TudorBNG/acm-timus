#include <iostream>

using namespace std;

int main() {
	unsigned long int a[4000], b[4000];
	int m, n, l, k = 0, p = 0;

	cin >> m;
	for (int i=0; i<m; i++) {
		cin >> a[i];
	}
	cin >> n;
	for (int i=0; i<n; i++) {
		cin >> l;
		for (int j=0; j<m; j++) {
			if (l==a[j]) {
				b[k] = l;
				k++;
			}
		}
	}
	cin >> n;
	for (int i = 0; i<n; i++) {
		cin >> l;
		for (int j = 0; j<k; j++) {
			if (l == b[j]) {
				p++;
			}
		}
	}
	cout << p;

	return 0;

}
