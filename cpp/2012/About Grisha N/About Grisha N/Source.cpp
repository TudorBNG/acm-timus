#include <iostream>

using namespace std;

int main() {
	short n;
	cin >> n;
	n = 12 - n;
	if (n*45 <= 240) {
		cout << "YES";
	}else {
		cout << "NO";
	}

	return 0;
}