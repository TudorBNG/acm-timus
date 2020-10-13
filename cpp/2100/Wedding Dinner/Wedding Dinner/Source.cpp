#include <iostream>
#include <string>
using namespace std;

int main() {
	int n, col = 2;
	string k;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> k;
		if (k.find("+one") != string::npos) {
			col += 2;
		}else {
			col += 1;
		}
	}
	if (col == 13) {
		cout << 1400;
	}
	else {
		cout << col * 100;
	}
	return 0;
}